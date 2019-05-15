package rest.assured.framework.request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.testng.annotations.Test;

public class GetDataTest {

    @Test
    public void testResponseCode() {
        Response resp =RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

        int code = resp.getStatusCode();
        System.out.println("Status code is " + code);

        Assert.assertEquals(code, 200);
    }
}
