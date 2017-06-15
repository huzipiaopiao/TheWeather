package com.ll.banbury.theweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by banbury on 2017/6/14.
 */
public class Forecast {

    public class More{

        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{

        public String max;

        public String min;
    }


    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
}
