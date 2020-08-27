package com.tacbin.pro.temp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author EDZ
 * @description
 * @date 2020/8/11 10:06
 */
public class TempTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.setSuperName("superName");
        obj.setSubName("subName");
        System.out.println(obj);
    }

}

@Getter
@Setter
@ToString
class Super {
    private String superName;
}

@Getter
@Setter
@ToString(callSuper = true)
class SubClass extends Super {
    private String subName;
}
