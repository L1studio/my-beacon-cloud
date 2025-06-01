package com.zlc.api.filter.impl;

import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import com.zlc.api.client.BeaconCacheClient;
import com.zlc.api.filter.CheckFilter;
import com.zlc.common.constant.CacheConstant;
import com.zlc.common.enums.ExceptionEnums;
import com.zlc.common.exception.ApiException;
import com.zlc.common.model.StandardSubmit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zjw
 * @description  校验请求的ip地址是否是白名单
 */
@Service(value = "ip")
@Slf4j
public class IPCheckFilter implements CheckFilter {

    @Autowired
    private BeaconCacheClient cacheClient;

    private final String IP_ADDRESS = "ipAddress";


    @Override
    public void check(StandardSubmit submit) {
        log.info("【接口模块-校验ip】   校验ing…………");
        //1. 根据CacheClient根据客户的apikey以及ipAddress去查询客户的IP白名单
        String ip = cacheClient.hgetString(CacheConstant.CLIENT_BUSINESS + submit.getApikey(), IP_ADDRESS);
        submit.setIp(ip);

        //2. 如果IP白名单为null，直接放行
        if (StringUtils.isEmpty(ip) || ip.contains(submit.getRealIP())) {
            log.info("【接口模块-校验ip】  客户端请求IP合法！");
            return;
        }

        //3. IP白名单不为空，并且客户端请求不在IP报名单内
        log.info("【接口模块-校验ip】  请求的ip不在白名单内");
        throw new ApiException(ExceptionEnums.IP_NOT_WHITE);
    }


}