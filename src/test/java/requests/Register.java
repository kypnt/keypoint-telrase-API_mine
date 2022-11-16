package requests;

import Pojo.RegisterPojo;
import com.github.javafaker.Faker;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.junit.Assert.*;

import utilities.ConfigurationReader;

import java.util.*;

import static io.restassured.RestAssured.*;

public class Register {

    static Response response;
    static String token;
    static String email;
    static String firstName;
    static boolean gdpr;
    static String lastName;
    static String linkedin;
    static String password;
    static Faker faker;

    static List<Map<String,Object>> registerMapList;

    public static Map<String,Object> faker(){
        Map<String,Object> fakers = new TreeMap<>();

        faker = new Faker();
        email = faker.internet().emailAddress();
        firstName = faker.name().firstName();
        gdpr = true;
        lastName = faker.name().lastName();
        linkedin = "https://linkedin.com/in/" + firstName;
        password= ConfigurationReader.get("password");
        fakers.put("confirmPassword",password);
        fakers.put("email",email);
        fakers.put("firstName",firstName);
        fakers.put("gdpr",gdpr);
        fakers.put("lastName",lastName);
        fakers.put("linkedIn",linkedin);
        fakers.put("password",password);
        return fakers;
        /*
        {
  "confirmPassword": "string",
  "email": "string",
  "firstName": "string",
  "gdpr": true,
  "lastName": "string",
  "linkedIn": "string",
  "password": "string"
}
         */

    }

    public static List<Map<String,Object>> registerRequest(){
        List<Map<String,Object>> listOfRegisterMap = new ArrayList<>();
        Map<String,Object> loginBody = new HashMap<>();
        Map<String,Object> bodyForPersonalInfo = new HashMap<>();

        faker = new Faker();
        email = faker.internet().emailAddress();
        firstName = faker.name().firstName();
        gdpr = true;
        lastName = faker.name().lastName();
        linkedin = "https://linkedin.com/in/" + firstName;
        password= ConfigurationReader.get("password");


        RegisterPojo registerPojo = new RegisterPojo(password,email,firstName,true,lastName,linkedin,password);


        response = given().contentType(ContentType.JSON).body(faker()).log().all()
                .when().post("auth/register").prettyPeek();

        token = response.jsonPath().getString("data.token");//token i burdan field a gonderiyoruz
        // yani class ın basındaki değişkene. Create class ı onu bu method yurudukten sonra
        // token i orada store edilmiş olarak bulsun diye.
        linkedin = response.jsonPath().getString("data.linkedin");


        loginBody.put("email",response.jsonPath().getString("data.email"));
        loginBody.put("password",password);


        bodyForPersonalInfo.put("firstName",response.jsonPath().getString("data.firstName"));
        bodyForPersonalInfo.put("lastName",response.jsonPath().getString("data.lastName"));
        bodyForPersonalInfo.put("linkedIn",response.jsonPath().getString("data.linkedIn"));

        listOfRegisterMap.add(loginBody);
        listOfRegisterMap.add(bodyForPersonalInfo);
        registerMapList=listOfRegisterMap;

//return loginBody;
return  listOfRegisterMap;

    }
    public static void verifyRegistration(int statuscode){
       //static import var
       assertEquals(statuscode,response.statusCode());

    }


}
