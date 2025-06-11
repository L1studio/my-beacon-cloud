package com.zlc.strategy.filter.impl;


import com.zlc.common.model.StandardSubmit;
import com.zlc.strategy.client.BeaconCacheClient;
import com.zlc.strategy.filter.StrategyFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "route")
@Slf4j
public class RouteStrategyFilter implements StrategyFilter {

    @Autowired
    private BeaconCacheClient cacheClient;

//    @Autowired
//    private ErrorSendMsgUtil sendMsgUtil;

    @Autowired
    private AmqpAdmin amqpAdmin;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void strategy(StandardSubmit submit) {
        log.info("【策略模块-路由策略】   校验ing…………");
        //1、拿到客户id
    }
}