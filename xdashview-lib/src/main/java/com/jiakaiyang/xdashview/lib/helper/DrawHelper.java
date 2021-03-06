package com.jiakaiyang.xdashview.lib.helper;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.jiakaiyang.xdashview.lib.DashConfig;

/**
 * Created by jia on 2018/3/27.
 * Helper to draw the DashView
 */

public abstract class DrawHelper {
    protected DashConfig dashConfig;
    protected Canvas canvas;
    protected Paint paint;

    public DrawHelper(DashConfig dashConfig, Canvas canvas, Paint paint) {
        this.dashConfig = dashConfig;
        this.canvas = canvas;
        this.paint = paint;
    }

    /**
     * Perform draw to the canvas of target DashView
     */
    public void draw() {
        switch (dashConfig.getOrientation()) {
            case DashConfig.ORIENTATION_VERTICAL:
                drawVerticalLine(canvas);
                break;
            case DashConfig.ORIENTATION_HORIZONTAL:
                drawHorizontalLine(canvas);
                break;
        }
    }

    protected abstract void drawVerticalLine(Canvas canvas);

    protected abstract void drawHorizontalLine(Canvas canvas);

}
