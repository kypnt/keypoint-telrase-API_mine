package requests;

import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Login {

    static String token;

    Map<String,Object> loginBody = new HashMap<>();

    public static void loginRequest(){                  //Map<String,Object>

        Map<String, Object> loginBody = Register.registerRequest().get(0);
//        Map<String, Object> perInfoBodyFromLoginRequest = Register.registerRequest().get(1);

        token = given().contentType(ContentType.JSON).body(loginBody).log().all()
                .when().post("/auth/login").prettyPeek().jsonPath().getString("data.token");

//        return perInfoBodyFromLoginRequest;
    }
}
