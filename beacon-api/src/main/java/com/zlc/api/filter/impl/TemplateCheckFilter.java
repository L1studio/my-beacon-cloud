package com.zlc.api.filter.impl;

import com.zlc.api.filter.CheckFilter;
import com.zlc.common.model.StandardSubmit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zjw
 * @description  校验短信的模板
 */
@Service(value = "template")
@Slf4j
public class TemplateCheckFilter implements CheckFilter {


    @Override
    public void check(StandardSubmit submit) {
        log.info("【接口模块-校验模板】   校验ing…………");
    }
}
