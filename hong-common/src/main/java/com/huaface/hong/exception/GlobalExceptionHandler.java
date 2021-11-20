package com.huaface.hong.exception;

import com.huaface.hong.utils.HongResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author chenhongbo
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理自定义异常
     */
    @ExceptionHandler(value = HongException.class)
    public HongResponse hongException(HongException e) {
        String message = e.getMessage();
        log.error(message);
        return HongResponse.error(message);
    }
}
