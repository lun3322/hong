package com.huaface.hong.exception;

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
    public ResponseEntity<Object> hongException(HongException e) {
        log.error(e.getMessage());
        return ResponseEntity.internalServerError().body(e.getMessage());
    }
}
