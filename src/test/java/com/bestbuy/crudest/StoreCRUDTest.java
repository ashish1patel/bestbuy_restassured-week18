package com.bestbuy.crudest;

import com.bestbuy.bestbuyinfo.StoreSteps;
import com.bestbuy.testbase.StoreTestBase;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class StoreCRUDTest extends StoreTestBase {


    String name = "prime";
    String type = "BigBox";
    String address= "13513 Ridgedale Dr";
    String address2 = "high street";
    String city= "Hopkins";
    String state = "MN";
    String zip= "55305";
    int lat = 44;
    int lng = 93;

    String hours = "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8";

    @Steps
    StoreSteps storeSteps;
    @Title("This will create new store")
@Test
    public void test01(){

        List<String> services = new ArrayList<>();
        services.add("abc");




        storeSteps.createStore(name,type,address,address2,city,state,zip,lat,lng,hours,services).statusCode(201);


    }

}
