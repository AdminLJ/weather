package android.weather.com.weathers.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by www60 on 2017/6/13.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
