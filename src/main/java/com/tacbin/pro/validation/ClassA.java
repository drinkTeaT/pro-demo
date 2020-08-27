package com.tacbin.pro.validation;

import lombok.ToString;

import javax.validation.constraints.NotNull;

/**
 * @author EDZ
 * @description
 * @date 2020/8/27 15:29
 */
@ToString
public class ClassA {
    @NotNull(message = "name不能为空")
    private String name;

    @NotNull(message = "age不能为空")
    private Integer age;
}