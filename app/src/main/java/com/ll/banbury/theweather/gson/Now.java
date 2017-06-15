package com.ll.banbury.theweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by banbury on 2017/6/14.
 */
public class Now {

    public class More{

        @SerializedName("txt")
        public String info;
    }

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
}
