package com.tacbin.pro.controller.testdata.moderator;

import cn.binarywang.tools.generator.ChineseAreaList;
import com.tacbin.pro.controller.testdata.PersonEntity;
import org.apache.commons.lang3.RandomUtils;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 18:28
 */
public class UsefulPersonInfo extends AbstractPersonInfo {
    public UsefulPersonInfo(IPersonInfo personInfo) {
        super(personInfo);
    }

    @Override
    public void setProperty(PersonEntity person) {
        super.setProperty(person);
        // 地址
        String homeAddr = ChineseAreaList.provinceCityList.get(
                RandomUtils.nextInt(0, ChineseAreaList.provinceCityList.size()));
        person.setHomeAddr(homeAddr);
    }
}
