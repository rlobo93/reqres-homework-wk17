package in.reqres.studentinfo;


import in.reqres.model.StudentPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentPatchTest extends TestBase {

    @Test
    public void updateStudentWithPatch(){
        StudentPojo studentPojo = new StudentPojo();

        Response response = given()
                .body(studentPojo)
                .when()
                .patch();
                response.then().statusCode(200);
                response.prettyPrint();

            }
}
