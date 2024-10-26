# rest-assured task
This repository is a recruitment process for the position of Senior QA Automation Engineer Test. Publish it here in this repository in response to the task.

This project was made as my answer to assignment which I got from the company where I am applying for the job and the position of Senior QA Automation Engineer Test. 

I spent 3 hours on average on the realization of this project

Side information: To use the application in a special environment the author accepts no responsibility if you cause damage to third parties

  A list of technologies used within the project:
* [macOS Sonoma](https://support.apple.com/en-us/HT214032): macOS Sonoma Version 14.1.2 (23B92)
* [Intellij idea](https://www.jetbrains.com/idea/): Version 2024.1 Build #IC-241.14494.17, built on March 6, 2024
* [Java](https://www.java.com/en/): Version openjdk version "21.0.2-ea"
* [rest-assured](https://rest-assured.io/): Version 5.3.0 
* [JUnit](https://junit.org/): Version 4.13.2

## Potential Bugs
***
As I haven't read the documentation for the endpoint I performed tested, and I consider the following to be potential bugs:
     
* Path Variables input can accept an empty string

   __Steps to reproduce__
   * Open the Postman app 
   * Send request to http://localhost:8080/:input
   * Path Variables input must be empty
   
   __Actual Result__
   
   I got the result :npt and status code 200 OK
   
   __Expected result__
   
   In my opinion, what should happen is to get a status code of 400 and an error message that the Path Variables input cannot be an empty string

## Collaboration
***
This project is closed and I do not accept any collaboration
> Please do not change the code. 
> This project is not an ongoing project.
> I am available for any questions.
