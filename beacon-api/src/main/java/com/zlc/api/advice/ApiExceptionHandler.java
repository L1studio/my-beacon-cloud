package com.zlc.api.advice;

import com.zlc.api.util.R;
import com.zlc.api.vo.ResultVO;
import com.zlc.common.exception.ApiException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler{

    @ExceptionHandler(ApiException.class)
    public ResultVO apiException(ApiException ex){
        return R.error(ex);
    }

}

