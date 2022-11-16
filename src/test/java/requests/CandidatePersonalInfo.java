package requests;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.restassured.http.ContentType;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class CandidatePersonalInfo {
    /*
    {
  "cityId": 0,
  "countryPhoneCode": "string",
  "firstName": "string",
  "lastName": "string",
  "linkedIn": "string",
  "mobile": "string"
}
     */
    static Faker faker;
    static String mobile;
    static String countryPhoneCode;
    static String cityId;

    public static void personalInfo(){
        mobile ="1234567";
        countryPhoneCode = "44";
        cityId = "2";

        Map<String, Object> perInfoBody =Register.registerMapList.get(1);
        perInfoBody.put("mobile",mobile);
        perInfoBody.put("countryPhoneCode",countryPhoneCode);
        perInfoBody.put("cityId",cityId);

        given().contentType(ContentType.JSON).body(perInfoBody).log().all().header("Authorization","Bearer "+Create.token)
                .when().put("http://54.194.180.243:9002/api/candidate/personnelInfo").prettyPeek();


    }


}
