package com.zlc.test.mapper;

import com.zlc.test.client.CacheClient;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(SpringRunner.class)
class MobileDirtyWordMapperTest {
    @Autowired
    private MobileDirtyWordMapper mapper;


    @Autowired
    private CacheClient cacheClient;

    @Test
    void findDirtyWord() {
        List<String> dirtyWords = mapper.findDirtyWord();
        cacheClient.saddStr("dirty_word",dirtyWords.toArray(new String[]{}));

    }
}