package requests;

import io.restassured.http.ContentType;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CandidatePositionUpdate {
    /*
    {
  "positions": [
    {
      "positionId": 0
    }
  ]
}
     */

    public static void personalInfo(){

        Object [] positions = new Object[1];

        Map<String,Object> positionId = new HashMap<>();

        positionId.put("positionId",73);

        positions[0]=positionId;

        Map<String, Object> posBody = new HashMap<>();
        posBody.put("positions",positions);


        given().contentType(ContentType.JSON).body(posBody).log().all().header("Authorization","Bearer "+Create.token)
                .when().put("http://54.194.180.243:9002/api/candidate/positions").prettyPeek();




    }
}
