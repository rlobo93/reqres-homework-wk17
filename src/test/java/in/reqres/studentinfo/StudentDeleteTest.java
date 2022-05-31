package in.reqres.studentinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class StudentDeleteTest extends TestBase {


    @Test
    public void deleteId(){
        Response response = given()
                .pathParams("id", 1)
                .when()
                .delete("/{users/}");
        response.then().statusCode(204);
        response.prettyPrint();

    }

}
