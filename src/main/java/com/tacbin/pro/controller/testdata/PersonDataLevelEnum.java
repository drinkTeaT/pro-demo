package com.tacbin.pro.controller.testdata;

import lombok.Getter;

/**
 * @author EDZ
 * @description
 * @date 2020/7/31 17:31
 */
public enum PersonDataLevelEnum {
    ACQUAINTANCE("1", "泛泛之交"), USEFUL("5", "实用型"), INTIMATE("10", "亲密型"), INSANE("15", "八卦型"), INHUMAN("20", "快递小哥");

    private String level;
    private String levelName;

    PersonDataLevelEnum(String level, String levelName) {
        this.level = level;
        this.levelName = levelName;
    }
}
