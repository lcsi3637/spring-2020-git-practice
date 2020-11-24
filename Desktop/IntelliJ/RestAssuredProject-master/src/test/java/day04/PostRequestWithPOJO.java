package day04;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pojo.Spartan;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class PostRequestWithPOJO {


    @BeforeAll
    public static void init(){


       RestAssured.baseURI = "http://54.173.35.133" ;
        //RestAssured.baseURI = "https://skillz.com/games.json" ;

        RestAssured.port = 8000 ;
        RestAssured.basePath = "/api" ;

    }


    @Test
    public void testPostBodyWithPojo() {

        Spartan sp1 = new Spartan("Muhammed topcu", "Male",1231231231 ) ;
        Map<String,Object> mp1=new HashMap<String,Object>();
        mp1.put("gender",sp1.getGender());
        mp1.put("name",sp1.getName());
        mp1.put("phone",sp1.getPhone());

        given()
                .log().all()
                .body(mp1);
        when()
                .post("/spartans").

        then()
                .log().all()
                .statusCode(201);



    }


}
