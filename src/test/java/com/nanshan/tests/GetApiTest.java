package com.nanshan.tests;

import com.nanshan.base.BaseTest;
import com.nanshan.restclient.RestClient;
import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by Administrator on 2020/3/24.
 */
public class GetApiTest extends BaseTest {
    BaseTest testBase;
    String host;
    String url;
    RestClient restClient;


    @BeforeClass
    public void setUp() {
        testBase = new BaseTest();
        host = prop.getProperty("HOST");
        url = host + "/api/users";
        System.out.println("url: " + url);
    }

    @Test
    public void getAPITest() throws ClientProtocolException, IOException {
        restClient = new RestClient();
        restClient.get(url);
    }
}
