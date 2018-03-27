package com.jiakaiyang.xdashview.lib.helper;

import android.graphics.Canvas;

import com.jiakaiyang.xdashview.lib.DashConfig;

/**
 * Created by jia on 2018/3/27.
 * Helper to draw the DashView
 */

public abstract class DrawHelper {
    protected DashConfig dashConfig;
    protected Canvas canvas;

    public DrawHelper(DashConfig dashConfig, Canvas canvas) {
        this.dashConfig = dashConfig;
        this.canvas = canvas;
    }

    /**
     * Perform draw to the canvas of target DashView
     */
    public abstract void draw();
}
