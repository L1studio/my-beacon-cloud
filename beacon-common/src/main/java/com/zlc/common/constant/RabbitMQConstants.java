package com.zlc.common.constant;

/**common中声明
 * RabbitMQ中的一些队列信息
 * @author zjw
 * @description
 */
public interface RabbitMQConstants {

    /**
     * 接口模块发送消息到策略模块的队列名称
     */
    String SMS_PRE_SEND = "sms_pre_send_topic";
}
