package apiTest.searchByQuality;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.given;

public class BaseQualityClass {

    public static final String BASEURL = "https://omgvamp-hearthstone-v1.p.rapidapi.com/";
    public static final String APIHOST = "omgvamp-hearthstone-v1.p.rapidapi.com";
    public static final String APIKEY = "9310fb3bfemsh4bd5d75929d1b89p139cf4jsn3cbfbd2869df";

    @DataProvider
    public static Object[][] costAndStats(){
        return new Object[][]{{1,1,1},{1,1,2},{1,1,3}};
    }

    public String getLegendaryCard(){
        return given().baseUri(BASEURL)
                .basePath("cards/qualities/Legendary?")
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", APIKEY)
                .header("X-RapidAPI-Host", APIHOST)
                .queryParam("cost",1)
                .queryParam("attack",1)
                .queryParam("durability",3)
                .when().get()
                .then().extract()
                .body().jsonPath().getString("name[0]");
    }

    @UseDataProvider("costAndStats")
    public List<QualityRoot> getLegCardByStats(Integer mana, Integer atk, Integer hp){
        return given().baseUri(BASEURL)
                .basePath("cards/qualities/Legendary?")
                .contentType(ContentType.JSON)
                .header("X-RapidAPI-Key", APIKEY)
                .header("X-RapidAPI-Host", APIHOST)
                .queryParam("cost",mana)
                .queryParam("attack",atk)
                .queryParam("health",hp)
                .when().get()
                .then().extract().body().jsonPath().getList("Root",QualityRoot.class);
    }


}
