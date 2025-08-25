package com.zlc.search.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SearchServiceTest {

    @Autowired
    private SearchService searchService;

    @org.junit.Test
    public void index() throws IOException {
        searchService.index("sms_submit_log_2023","4","{\"clientId\": 4}");
    }

    @Test
    public void exists() throws IOException {
        System.out.println(searchService.exists("sms_submit_log_2025", "368076443118206976"));
    }
}