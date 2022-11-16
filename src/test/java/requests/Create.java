package requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Create {

static Response response;
static String token;
    public static void userCreate(String role){
        response  = given().contentType(ContentType.JSON).header("Authorization", "Bearer " + Register.token)
                .when().post("http://54.194.180.243:9002/api/user/" + role + "/create").prettyPeek();

        token = response.jsonPath().getString("data.token");
    }


}
