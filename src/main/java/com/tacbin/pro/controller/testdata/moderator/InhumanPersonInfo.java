package com.tacbin.pro.controller.testdata.moderator;

import cn.binarywang.tools.generator.ChineseAddressGenerator;
import cn.binarywang.tools.generator.EmailAddressGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import com.tacbin.pro.controller.testdata.PersonEntity;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 18:05
 */
public class InhumanPersonInfo extends AbstractPersonInfo{
    public InhumanPersonInfo(IPersonInfo personInfo) {
        super(personInfo);
    }

    @Override
    public void setProperty(PersonEntity person) {
        super.setProperty(person);
        // 地址
        GenericGenerator generator = ChineseAddressGenerator.getInstance();
        person.setHomeAddr(generator.generate());
        // email
        generator = EmailAddressGenerator.getInstance();
        person.setEmailAddr(generator.generate());
    }
}
