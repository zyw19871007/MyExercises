package com.shadow.zyw.sdu.intentobject;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shadow on 2015/7/2.
 */
public class UserParcel implements Parcelable{
    private String name;
    private int age;

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);

    }

    public static final Parcelable.Creator<UserParcel> CREATOR = new Creator<UserParcel>() {
        @Override
        public UserParcel createFromParcel(Parcel source) {
            String name = source.readString();
            int age = source.readInt();
            UserParcel userSeri = new UserParcel();
            userSeri.setName(name);
            userSeri.setAge(age);
            return userSeri;
        }

        @Override
        public UserParcel[] newArray(int size) {
            return new UserParcel[size];
        }
    };
}
