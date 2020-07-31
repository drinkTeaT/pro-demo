package com.tacbin.pro.controller.testdata.moderator;

import cn.binarywang.tools.generator.ChineseMobileNumberGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import com.tacbin.pro.controller.testdata.PersonEntity;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 17:56
 */
public class IntimatePersonInfo extends AbstractPersonInfo{
    public IntimatePersonInfo(IPersonInfo personInfo) {
        super(personInfo);
    }

    @Override
    public void setProperty(PersonEntity person) {
        super.setProperty(person);
        // 电话号码
        GenericGenerator generator = ChineseMobileNumberGenerator.getInstance();
        person.setPhoneNumber(generator.generate());
    }
}
