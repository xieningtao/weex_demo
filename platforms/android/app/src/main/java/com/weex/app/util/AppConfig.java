package com.weex.app.util;

import android.content.Context;


/**
 * Created by budao on 2016/10/12.
 */
public class AppConfig {
  private static final String TAG = "AppConfig";
  private static AppPreferences sPreferences = new AppPreferences();

  public static void init(Context context) {
    loadAppSetting(context);
  }

  public static String getLaunchUrl() {
//    if (isLaunchLocally()) {
//      return sPreferences.getString("local_url", "file://assets/entry.js");
//    }
//    return sPreferences.getString("launch_url", "http://127.0.0.1:8080/dist/index.js");
//    return sPreferences.getString("launch_url", "http://10.224.121.20:8081/dist/index.js");
//    return "http://10.224.121.20:8091/dist/entry.js";
    return "file://assets/dist/entry.js";
//    return "file://assets/dist/index.js";
  }

  public static Boolean isLaunchLocally() {
    return sPreferences.getBoolean("launch_locally", false);
  }

  private static void loadAppSetting(Context context) {
    AppConfigXmlParser parser = new AppConfigXmlParser();
    parser.parse(context);
    sPreferences = parser.getPreferences();
  }
}
