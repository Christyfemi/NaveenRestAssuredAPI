package Getting_Started;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Test_Put {
        @Test
        public void test_1_Put(){

            JSONObject request = new JSONObject();

            request.put("name" , "Olufemi");
            request.put("job" , "Test analyst");
            System.out.println(request);
            System.out.println(request.toJSONString());


            given().
                    header("Content-Type", "application/json").
                    contentType(ContentType.JSON).
                    accept(ContentType.JSON).
                    body(request.toJSONString()).
                    when().
                    put("https://reqres.in/api/users/2").
                    then().
                    // note for post request t he Statuscode should be 201
                            statusCode(200).log().all();
        }



}
