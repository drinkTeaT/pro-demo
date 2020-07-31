package com.tacbin.pro.controller.testdata.moderator;

import cn.binarywang.tools.generator.ChineseNameGenerator;
import cn.binarywang.tools.generator.base.GenericGenerator;
import com.tacbin.pro.controller.testdata.PersonEntity;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 17:51
 */
public class PersonInfoEntity implements IPersonInfo {
    @Override
    public void setProperty(PersonEntity person) {
        // 名字
        GenericGenerator generator = ChineseNameGenerator.getInstance();
        person.setName(generator.generate());
        // 头像
        person.setHeadImg("//image");
    }
}
