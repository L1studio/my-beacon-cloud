package com.zlc.api.filter.impl;

import com.zlc.api.filter.CheckFilter;
import com.zlc.common.model.StandardSubmit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zjw
 * @description  校验短信的签名
 */
@Service(value = "sign")
@Slf4j
public class SignCheckFilter implements CheckFilter {


    @Override
    public void check(StandardSubmit submit) {
        log.info("【接口模块-校验签名】   校验ing…………");
    }
}
