package com.jesen.harmony.svd.utils;

import ohos.agp.utils.Point;
import ohos.agp.window.service.Display;
import ohos.agp.window.service.DisplayManager;
import ohos.app.Context;

import java.util.Optional;

public class ScreenUtil {
    public static int getScreenWidth(Context context){
        DisplayManager displayManager = DisplayManager.getInstance();
        Optional<Display> defaultDisplay = displayManager.getDefaultDisplay(context);
        Point point = new Point(0,0);
        if (!defaultDisplay.isPresent()){
            return (int) point.position[0];
        }else {
            Display display = defaultDisplay.get();
            display.getSize(point);
            return (int) point.position[0];
        }
    }
}