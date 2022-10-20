package apiTest.formatClasses;

import io.restassured.http.ContentType;
import java.util.List;

import static io.restassured.RestAssured.given;

public abstract class BaseGetRequest {

    public static final String BASEURL = "https://omgvamp-hearthstone-v1.p.rapidapi.com/";
    public static final String APIHOST = "omgvamp-hearthstone-v1.p.rapidapi.com";
    public static final String APIKEY = "9310fb3bfemsh4bd5d75929d1b89p139cf4jsn3cbfbd2869df";

    public List<CardByRace> getCardByRace(String race){
        return given().baseUri(BASEURL)
                .basePath(race)
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", APIKEY)
                .header("X-RapidAPI-Host", APIHOST)
                .when().get()
                .then().log().all()
                .extract().body().jsonPath().getList("Root",CardByRace.class);
    }
}
