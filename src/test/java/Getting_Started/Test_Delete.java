package Getting_Started;

import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Test_Delete {
    @Test
    public void test_1_Delete(){



        given().

                when().
                delete("https://reqres.in/api/users/2").
                then().
                // note for post request t he Statuscode should be 201
                        statusCode(204).log().all();
    }





}
