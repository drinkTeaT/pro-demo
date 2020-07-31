package com.tacbin.pro.controller.testdata.moderator;

import com.tacbin.pro.controller.testdata.PersonEntity;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 17:55
 */
public abstract class AbstractPersonInfo implements IPersonInfo {
    protected IPersonInfo personInfo;

    public AbstractPersonInfo(IPersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    @Override
    public void setProperty(PersonEntity person) {
        personInfo.setProperty(person);
    }
}
