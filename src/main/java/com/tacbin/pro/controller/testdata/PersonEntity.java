package com.tacbin.pro.controller.testdata;

import lombok.Data;

import java.io.Serializable;

/**
 * @author EDZ
 * @description
 * @date 2020/7/30 16:18
 */
@Data
public class PersonEntity implements Serializable {
    private String name;
    private String homeAddr;
    private String idCardNumber;
    private String phoneNumber;
    private String emailAddr;
    private String englishName;
    private String headImg;
}
