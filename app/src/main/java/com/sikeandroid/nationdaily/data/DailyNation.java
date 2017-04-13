package com.sikeandroid.nationdaily.data;

import java.util.UUID;

/********************************************************************************
 * using for:
 * 丁酉鸡年二月 2017/04/02 20:11
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
public class DailyNation {

    private UUID mId;
    private String mName;
    private String mDate;
    private int mImage;
    private int mSuspect;



    public DailyNation(int image,String date, String name, int suspect)
    {
        mImage = image;
        mName = name;
        mSuspect = suspect;
        mDate = date;
    }

    public UUID getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getnName() {
        return mName;
    }

    public void setnName(String nName) {
        this.mName = nName;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public int getSuspect() {
        return mSuspect;
    }

    public void setSuspect(int suspect) {
        mSuspect = suspect;
    }
}
