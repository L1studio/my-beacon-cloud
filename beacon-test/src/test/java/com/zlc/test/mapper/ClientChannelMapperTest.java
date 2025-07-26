package com.zlc.test.mapper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zlc.test.client.CacheClient;
import com.zlc.test.entity.ClientChannel;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
class ClientChannelMapperTest {
    @Autowired
    private ClientChannelMapper mapper;

    @Autowired
    private CacheClient cacheClient;

    @Test
    void findAll() throws JsonProcessingException {
        List<ClientChannel> list = mapper.findAll();
        for (ClientChannel clientChannel : list) {
            ObjectMapper objectMapper = new ObjectMapper();
            Map map = objectMapper.readValue(objectMapper.writeValueAsString(clientChannel), Map.class);
            cacheClient.sadd("client_channel:" + clientChannel.getClientId(),map);
        }
    }
}