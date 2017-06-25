package com.yiddev.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by rong on 2017/6/25.
 */

public class County extends DataSupport
{
    private int id;
    private String countyName;
    private int cityId;
    private String weatherId;

    public County(int id, String countyName, int cityId, String weatherId) {
        this.id = id;
        this.countyName = countyName;
        this.cityId = cityId;
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
