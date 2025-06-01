package com.zlc.test.mapper;

import com.zlc.test.client.CacheClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class ClientBalanceMapperTest {

    @Autowired
    private ClientBalanceMapper mapper;

    @Autowired
    private CacheClient cacheClient;

    @Test
    public void findByClientId() {
        Long balance = mapper.findByClientId(1L);
        System.out.println(balance);

        cacheClient.set("client_balance:1",balance);
    }
}