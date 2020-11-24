package day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredMethodChaining {

    @DisplayName("First Attempt for chaining")
    @Test
    public void chainingMethodsTest1(){

//       given().
            // some more information you want to provide other than request url
            // like header , query param , path variable , body
//       when()
            // you send the request GET POST PUT PATCH DELETE
//        then()
            // VALIDATE SOMETHING HERE

         //http://54.174.216.245:8000/api/hello
        when().
                get("http://54.174.216.245:8000/api/hello").   // sending a request to this url
        then().                         // assertions start here
                statusCode(200).        // asserting status code is 200
                header("Content-Length", "17" ) ;  // asserting header is "17"


    }
    @DisplayName("Using Hamcrest matcher for assertion")
    @Test
    public void testingWithMatcher(){


        when().
                get("http://54.173.35.133:8000/api/hello").   // sending a request to this url
                prettyPeek().
        then().                         // asssrtions start here
                statusCode( is(200) ).        // asserting status code is 200
                header("Content-Length",  equalTo("17") ).
                header("Content-Type", is("text/plain;charset=UTF-8") ).
                body( is("Hello from Sparta") );
                    ;  // asserting header is "17"
        ;

    }
    @DisplayName("Testing GET /api/Spartans endpoint")
    @Test
    public void testAllSpartans(){

            // given part -- RequestSpecification
                        // you can add information like header, query param, path var, body
                        // if this request need authentication , it also goes to give section
            // when part --- Send Request(GET POST PUT DELETE)
            //                  --Get response
            // then part -- Validatable Response
                        // this is where assertions start
                        // you can chain multiple assertions
                        // if any assertions fail , whole test fail.

            given().
                    header("Accept","application/xml").

            when().
                    get("http://54.173.35.133:8000/api/spartans").
                    prettyPeek().
            then().
                    statusCode( is(200) )
            ;

    }

    @DisplayName("Neset ile beraber self study icin")
    @Test
    public void testAllSpartansSelfStudy(){

            // given part -- RequestSpecification
                        // you can add information like header, query param, path var, body
                        // if this request need authentication , it also goes to give section
            // when part --- Send Request(GET POST PUT DELETE)
            //                  --Get response
            // then part -- Validatable Response
                        // this is where assertions start
                        // you can chain multiple assertions
                        // if any assertions fail , whole test fail.

            given().
                    param("nameContains","Saban").
                    header("Accept","application/json").
            when().
                    get("http://54.173.35.133:8000/api/spartans/search").
                    prettyPeek().

            then().
                    statusCode( is(200) );

    }

}
