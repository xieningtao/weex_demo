package com.weex.app;

import android.app.Application;
import android.util.Log;

import com.taobao.weex.WXEnvironment;
import com.weex.app.extend.ImageAdapter;
import com.weex.app.extend.WXEventModule;
import com.alibaba.weex.plugin.loader.WeexPluginContainer;
import com.weex.app.util.AppConfig;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

public class WXApplication extends Application {
private final String TAG = "WXApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"method->AppStart");
        //initDebugEnvironment(true, "10.224.121.20");
        WXSDKEngine.addCustomOptions("appName", "WXSample");
        WXSDKEngine.addCustomOptions("appGroup", "WXApp");
        WXSDKEngine.initialize(this,
                new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build()
        );
        try {
            WXSDKEngine.registerModule("event", WXEventModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
        AppConfig.init(this);
        WeexPluginContainer.loadAll(this);

//    WXSDKEngine.reload();
    }

    private void initDebugEnvironment(boolean enable, String host) {
        WXEnvironment.sApplication = this;
        WXEnvironment.sRemoteDebugMode = enable;
        WXEnvironment.sRemoteDebugProxyUrl = "ws://" + host + ":8089/debugProxy/native/5b59dc71-78e9-44e3-a97a-768185e4f125";
    }
}
