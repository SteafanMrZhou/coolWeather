package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class Province extends DataSupport {
    private int id;//每个实体类中都应该有的字段
    private String provinceName;//定义省的名称
    private int provinceCode;//定义省的代号
    public int getId(){
        return id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setProvinceName(String newProvinceName){
        this.provinceName = newProvinceName;
    }
    public void setProvinceCode(int newProvinceCode){
        this.provinceCode = newProvinceCode;
    }
}
