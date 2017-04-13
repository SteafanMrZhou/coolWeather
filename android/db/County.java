package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class County extends DataSupport {
    private int id;
    private String countyName;//定义县的名字
    private String weatherId;//定义县所对应的天气Id
    private int cityId;//定义当前所属市的Id
    public int getId(){
        return id;
    }
    public String getCountyName(){
        return countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setCountyName(String newCountyName){
        this.countyName = newCountyName;
    }
    public void setWeatherId(String newWeatherId){
        this.weatherId = newWeatherId;
    }
    public void setCityId(int newCityId){
        this.cityId = newCityId;
    }
}
