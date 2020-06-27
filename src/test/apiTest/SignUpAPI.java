package apiTest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import apiData.SignUpInfo;

import static io.restassured.RestAssured.given;


public class SignUpAPI {
        private static RequestSpecification requestSpecification;
        @BeforeClass
        public static void createRequestSpec(){
            requestSpecification = new RequestSpecBuilder().
                                    setBaseUri("https://equos.io").
                                    setBasePath("/api/registerUser").
                                    setContentType("application/json").
                                    setAccept("application/json").
                                    build();
        }

        @Test (priority = 0)
        public void signUpAPI(){
            SignUpInfo signUpInfo = new SignUpInfo("0", "hoang-test-05@yopmail.com", "hoang-test-05@yopmail.com", "1234qwer!Q",
                                                    "Vietnam", "0", "1", "1" );
            given().
                    spec(requestSpecification).
                    body(signUpInfo).
                    when().log().all().
                    post().then().
                    assertThat().statusCode(200);

        }



}
