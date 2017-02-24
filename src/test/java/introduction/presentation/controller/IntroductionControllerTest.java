package introduction.presentation.controller;

import com.jayway.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static com.jayway.restassured.RestAssured.given;

@RunWith(SpringJUnit4ClassRunner.class)
public class IntroductionControllerTest {

    @Value("${server.port}")
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void all() {
        given().when()
                .port(this.port)
                .get("/introduction").
                then().log().all().
                statusCode(HttpStatus.SC_OK);
    }
}
