package Getting_Started;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Test_Get {

    @Test
    public void test_1(){
        given()
                //in case of finding header use the folowing
               // header("Content-Type", "application/json").
               // param("parameterName", "parameterValues")
                        .get("https://reqres.in/api/users?page=2")
                .then().statusCode(200)
                .body("data.id[1]",equalTo(8))
                .body("data.first_name",hasItems("Michael", "Lindsay"));
              // .log().all();

    }
}
