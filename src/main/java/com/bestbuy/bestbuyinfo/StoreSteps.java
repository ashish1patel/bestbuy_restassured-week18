package com.bestbuy.bestbuyinfo;


import com.bestbuy.model.StorePojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class StoreSteps {
@Step
    public ValidatableResponse createStore(String name, String type, String address, String address2, String city, String state,
                                           String zip, int lat, int lag, String hours, List<String> services) {

        StorePojo storePojo = new StorePojo();
        storePojo.setName(name);
        storePojo.setType(type);
        storePojo.setAddress(address);
        storePojo.setAddress2(address2);
        storePojo.setCity(city);
        storePojo.setState(state);
        storePojo.setZip(zip);
        storePojo.setLat(lat);
        storePojo.setLng(lag);
        storePojo.setHours(hours);
        storePojo.setServices(services);

       return SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(storePojo)
                .when()
                .post()
                .then();
    }
}
