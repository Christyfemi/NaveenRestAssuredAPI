package Getting_Started;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;
public class Test_Post {
    @Test
    public void test_1_Post(){
//        Map<String, Object> map = new HashMap<String, Object>();
//
//        map.put("name","Olufemi");
//        map.put("job","Teacher");
//
//        System.out.println(map);
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
                post("https://reqres.in/api/users").
                then().
                // note for post request t he Statuscode should be 201
                  statusCode(201);
    }
}
