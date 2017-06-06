package com.ll.banbury.theweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by banbury on 2017/6/6.
 */
public class Province extends DataSupport{
    private int id;
    private String provinceName;
    private int privinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getPrivinceCode() {
        return privinceCode;
    }

    public void setPrivinceCode(int privinceCode) {
        this.privinceCode = privinceCode;
    }
}
