package test;

import base.Base;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

public class TestCasumo extends Base {

    @Test
    public void testFor_O_Positive() {
        // Given
        String input = "World";

        // When
        Response response = RestAssured.get(input);

        // Then
        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("Wrld", response.getBody().asString());
    }

    @Test
    public void testFor_A_I_U_E_Positive() {
        // Given
        String input = "Paiute";//Meaning of https://www.google.com/search?q=paiute+meaning

        // When
        Response response = RestAssured.get(input);

        // Then
        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("Pt", response.getBody().asString());
    }

    @Test
    public void testFor_Words_That_Not_Contain_Vowels_Negative() {
        // Given
        String input = "Crypt";

        // When
        Response response = RestAssured.get(input);

        // Then
        Assert.assertEquals(200, response.getStatusCode());
        Assert.assertEquals("Crypt", response.getBody().asString());
    }

    @Test
    public void testForEmpty_String_Negative() {
        // Given
        String input = "";

        // When
        Response response = RestAssured.get(input);

        // Then
        Assert.assertEquals(400, response.getStatusCode());
    /*
    * In my humble opinion this is a bug
    * The reason why I think it's a bug is because in the task it says
    *  "GET /:input should return the input without the vowels"
    * but when an empty string is sent then the response 200 is received which
    * is not ok because and the server should do validation and if it is an empty string
    * it should return an error message.
    * What Are Vowels? https://www.grammarly.com/blog/vowels/
    */

    }
}
