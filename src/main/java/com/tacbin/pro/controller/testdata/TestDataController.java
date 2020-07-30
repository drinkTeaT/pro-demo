package com.tacbin.pro.controller.testdata;

import cn.binarywang.tools.generator.*;
import cn.binarywang.tools.generator.base.GenericGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EDZ
 * @description
 * @date 2020/7/30 16:13
 */
@RestController
@RequestMapping("/testData")
public class TestDataController {
    @RequestMapping(method = RequestMethod.GET, path = "/genPersonInfo")
    public PersonEntity genPersonInfo() {
        PersonEntity personEntity = new PersonEntity();
        // 名字
        GenericGenerator generator = ChineseNameGenerator.getInstance();
        personEntity.setName(generator.generate());
        // 地址
        generator = ChineseAddressGenerator.getInstance();
        personEntity.setHomeAddr(generator.generate());
        // id card
        generator = ChineseIDCardNumberGenerator.getInstance();
        personEntity.setIdCardNumber(generator.generate());
        // phone number
        generator = ChineseMobileNumberGenerator.getInstance();
        personEntity.setPhoneNumber(generator.generate());
        // email
        generator = EmailAddressGenerator.getInstance();
        personEntity.setEmailAddr(generator.generate());
        // englishName
        generator = EnglishNameGenerator.getInstance();
        personEntity.setEnglishName(generator.generate());
        // face
        // https://drive.google.com/drive/folders/1wSy4TVjSvtXeRQ6Zr8W98YbSuZXrZrgY
        return personEntity;
    }
}
