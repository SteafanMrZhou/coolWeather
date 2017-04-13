package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class City extends DataSupport {
    private int id;
    private String cityName;//定义市的名字
    private int cityCode;//定义市的代号
    private int provinceId;//定义当前市所属省的Id值
    public int getId(){
        return id;
    }
    public String getCityName(){
        return cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setCityName(String newCityName){
        this.cityName = newCityName;
    }
    public void setCityCode(int newCityCode){
        this.cityCode  =newCityCode;
    }
    public void setProvinceId(int newProvinceId){
        this.provinceId = newProvinceId;
    }
}
