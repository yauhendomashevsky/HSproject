package apiTest;

import apiTest.formatClasses.BaseGetRequest;
import apiTest.formatClasses.CardByRace;
import apiTest.formatClasses.CardResponce;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.List;
import static io.restassured.RestAssured.given;

@RunWith(DataProviderRunner.class)
public class apiSearchTest extends BaseGetRequest{

    @Test
    public void searchCardTest(){
        String type = given().baseUri(BASEURL)
                .basePath("cards/%D0%98%D0%B7%D0%B5%D1%80%D0%B0")
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", APIKEY)
                .header("X-RapidAPI-Host", APIHOST)
                .when().get()
                .then().log().body()
                    .extract().body().jsonPath().param("race",CardResponce.class).getString("race");
        Assert.assertEquals("Drag","Dragon",type);
    }

    @DataProvider()
    public static Object[][] raceProviderMethod() {
        return new Object[][] {
                {"Demon", 395},
                {"Dragon", 362},
                {"Beast", 896},
                {"Mech", 340},
                {"Murloc", 234},
                {"Elemental", 393},
                {"Naga", 164},
                {"Pirate", 184},
                {"QUILBOAR", 64},
                {"Totem", 57}};
    }

    @Test()
    @UseDataProvider("raceProviderMethod")
    public void searchCardByRace(String race, Integer numberOfCard) {
            List<CardByRace> cardByRaceList = getCardByRace("cards/races/" + race);
            Assert.assertEquals(cardByRaceList.size(), (int) numberOfCard);
    }
}
