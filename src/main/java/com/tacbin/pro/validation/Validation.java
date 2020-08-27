package com.tacbin.pro.validation;

import org.springframework.stereotype.Component;

import javax.validation.Valid;

/**
 * @author EDZ
 * @description
 * @date 2020/8/27 15:18
 */
@Component
public class Validation {
    public void doValidate(@Valid ClassA a) {
        System.out.println(a);
    }
}
