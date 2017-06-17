package android.weather.com.weathers.gson;

/**
 * Created by www60 on 2017/6/13.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
