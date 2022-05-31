package in.reqres.studentinfo;


import in.reqres.model.StudentPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class PostCreateTest extends TestBase {

    @Test
    public void createStudent() {

        StudentPojo studentPojo = new StudentPojo();


        studentPojo.setEmail("eve.holt@reqres.in");
        studentPojo.setPassword("cityslicka");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
