package com.tacbin.pro.controller.testdata;

import com.tacbin.pro.controller.testdata.moderator.*;
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
    public List<PersonEntity> genPersonInfo(String level) {
        PersonDataLevelEnum levelEnum = PersonDataLevelEnum.valueOf(level);
        int count = 10;
        switch (levelEnum) {
            case ACQUAINTANCE:
                return acqInfo(count);
            case USEFUL:
                return usefulInfo(count);
            case INTIMATE:
                return intimateInfo(count);
            case INSANE:
                return insaneInfo(count);
            case INHUMAN:
                return inhumanInfo(count);
            default:
                return null;
        }
    }

    private List<PersonEntity> acqInfo(int count) {
        IPersonInfo personInfo = new PersonInfoEntity();
        return genPersonEntities(personInfo, count);
    }

    private List<PersonEntity> inhumanInfo(int count) {
        IPersonInfo personInfo = new PersonInfoEntity();
        IPersonInfo intimateInfo = new IntimatePersonInfo(personInfo);
        IPersonInfo insaneInfo = new InsanePersonInfo(intimateInfo);
        IPersonInfo inhumanInfo = new InhumanPersonInfo(insaneInfo);
        return genPersonEntities(inhumanInfo, count);
    }

    private List<PersonEntity> insaneInfo(int count) {
        IPersonInfo personInfo = new PersonInfoEntity();
        IPersonInfo intimateInfo = new IntimatePersonInfo(personInfo);
        IPersonInfo insaneInfo = new InsanePersonInfo(intimateInfo);
        return genPersonEntities(insaneInfo, count);
    }

    private List<PersonEntity> intimateInfo(int count) {
        IPersonInfo personInfo = new PersonInfoEntity();
        IPersonInfo intimateInfo = new IntimatePersonInfo(personInfo);
        return genPersonEntities(intimateInfo, count);
    }

    private List<PersonEntity> usefulInfo(int count) {
        IPersonInfo personInfo = new PersonInfoEntity();
        IPersonInfo usefulInfo = new UsefulPersonInfo(personInfo);
        return genPersonEntities(usefulInfo, count);
    }

    /**
     * 生成PersonEntity列表
     *
     * @param personInfo
     * @param count
     * @return
     */
    private List<PersonEntity> genPersonEntities(IPersonInfo personInfo, int count) {
        List<PersonEntity> personInfoEntities = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            PersonEntity personEntity = new PersonEntity();
            personInfo.setProperty(personEntity);
            personInfoEntities.add(personEntity);
        }
        return personInfoEntities;
    }
}
