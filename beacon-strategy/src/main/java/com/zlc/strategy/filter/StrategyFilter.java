package com.zlc.strategy.filter;

import com.zlc.common.model.StandardSubmit;

/**
 * @author zjw
 * @description
 */
public interface StrategyFilter {

    /**
     * 校验！！！！
     * @param submit
     */
    void strategy(StandardSubmit submit);
}
