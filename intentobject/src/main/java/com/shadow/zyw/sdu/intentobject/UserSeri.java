package com.shadow.zyw.sdu.intentobject;

import java.io.Serializable;

/**
 * Created by shadow on 2015/7/2.
 */
public class UserSeri implements Serializable {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
