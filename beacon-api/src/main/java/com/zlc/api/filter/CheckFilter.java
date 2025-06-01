package com.zlc.api.filter;

import com.zlc.common.model.StandardSubmit;

/**
 *
 * @author zjw
 * @description 做策略模式的父接口
 */
public interface CheckFilter {

    /**
     * 校验！！！！
     * @param submit
     */
    void check(StandardSubmit submit);

}
