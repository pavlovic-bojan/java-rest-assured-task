package base;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class Base {

   @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "http://localhost:8080/";
    }

}

