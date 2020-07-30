package com.tacbin.pro.controller.testdata;

import cn.binarywang.tools.generator.*;
import cn.binarywang.tools.generator.base.GenericGenerator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author EDZ
 * @description
 * @date 2020/7/30 16:13
 */
@RestController
@RequestMapping("/testData")
public class TestDataController {
    @RequestMapping(method = RequestMethod.GET, path = "/genPersonInfo")
    public List<PersonEntity> genPersonInfo() {
        List<PersonEntity> personEntityList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
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
            // https://drive.google.com/drive/folders/1wSy4TVjSvtXeRQ6Zr8W98YbSuZXrZrgY}
            personEntityList.add(personEntity);
        }
        // https://github.com/pwxcoo/chinese-xinhua/blob/master/data/ci.json 歇后语 词语
        return personEntityList;
    }
}
