package android.weather.com.weathers.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by www60 on 2017/6/13.
 * 使用 @SerializedName 注解的方式让 JSON 字段和 JAVA 字段之间建立映射关系
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
