package com.tacbin.pro.controller.testdata.moderator;

import cn.binarywang.tools.generator.ChineseIDCardNumberGenerator;
import cn.binarywang.tools.generator.EnglishNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import com.tacbin.pro.controller.testdata.PersonEntity;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 18:03
 */
public class InsanePersonInfo extends AbstractPersonInfo{
    public InsanePersonInfo(IPersonInfo personInfo) {
        super(personInfo);
    }

    @Override
    public void setProperty(PersonEntity person) {
        super.setProperty(person);
        // englishName
        GenericGenerator generator = EnglishNameGenerator.getInstance();
        person.setEnglishName(generator.generate());
        // id card
        generator = ChineseIDCardNumberGenerator.getInstance();
        person.setIdCardNumber(generator.generate());
    }
}
