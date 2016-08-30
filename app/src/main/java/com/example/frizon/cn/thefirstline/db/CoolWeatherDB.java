package com.example.frizon.cn.thefirstline.db;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Administrator on 2016/8/30.
 */
public class CoolWeatherDB {

    /**
     * 数据库名称
     */
    public static final String DB_NAME = "cool_weather";

    public static final int VERSION = 1;

    private static CoolWeatherDB coolWeatherDB;

    private SQLiteDatabase db;


}
