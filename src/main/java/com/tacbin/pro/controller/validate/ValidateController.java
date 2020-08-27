package com.tacbin.pro.controller.validate;

import com.tacbin.pro.validation.ClassA;
import com.tacbin.pro.validation.Validation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author EDZ
 * @description
 * @date 2020/8/27 15:27
 */
@RestController
@RequestMapping("validate")
public class ValidateController {
    @Resource
    private Validation validation;

    @GetMapping("/do")
    public String doValidate() {
        ClassA a = new ClassA();
        validation.doValidate(a);
        return "success";
    }

    @GetMapping("/params")
    public String paramsValidate(@Valid ClassA a) {
        return "success";
    }
}
