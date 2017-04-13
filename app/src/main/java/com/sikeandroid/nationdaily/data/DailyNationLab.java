package com.sikeandroid.nationdaily.data;

import android.content.Context;

import com.sikeandroid.nationdaily.R;

import java.util.ArrayList;
import java.util.List;

/********************************************************************************
 * using for:
 * 丁酉鸡年三月 2017/04/02 20:08
 * @author 西唐王, xtwyzh@gmail.com,xtwroot.com
 * xtwroot Copyrights (c) 2017. All rights reserved.
 ********************************************************************************/
public class DailyNationLab {

    private static DailyNationLab sDailyNationLab;

    private List<DailyNation> mDailyNations;

    public static DailyNationLab get(Context context)
    {
        if(sDailyNationLab == null)
        {
            sDailyNationLab = new DailyNationLab(context);
        }
        return sDailyNationLab;
    }

    private DailyNationLab(Context context)
    {
        mDailyNations = new ArrayList<>();
        DailyNation dailyNation1 = new DailyNation(R.drawable.mz_1achang,"2017-4-1","阿昌族",R.string.jj_1);
        mDailyNations.add(dailyNation1);
        DailyNation dailyNation2 = new DailyNation(R.drawable.mz_2bai,"2017-4-2","白族",R.string.jj_2);
        mDailyNations.add(dailyNation2);
        DailyNation dailyNation3 = new DailyNation(R.drawable.mz_3baoan,"2017-4-3","保安族",R.string.jj_3);
        mDailyNations.add(dailyNation3);
        DailyNation dailyNation4 = new DailyNation(R.drawable.mz_4bulang,"2017-4-4","布朗族",R.string.jj_4);
        mDailyNations.add(dailyNation4);
        DailyNation dailyNation5 = new DailyNation(R.drawable.mz_5buyi,"2017-4-5","布依族",R.string.jj_5);
        mDailyNations.add(dailyNation5);
        DailyNation dailyNation6 = new DailyNation(R.drawable.mz_6zang,"2017-4-6","藏族",R.string.jj_6);
        mDailyNations.add(dailyNation6);
    }

    public List<DailyNation> getDailyNations()
    {
        return mDailyNations;
    }

    public DailyNation getDailyNation(String date)
    {
        for(DailyNation dailyNation : mDailyNations)
        {
            if(dailyNation.getDate().equals(date))
                return dailyNation;
        }
        return null;
    }




}
