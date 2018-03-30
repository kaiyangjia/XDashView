package com.jiakaiyang.xdashview.lib.helper;


import android.graphics.Canvas;
import android.graphics.Paint;

import com.jiakaiyang.xdashview.lib.DashConfig;

/**
 * Created by jia on 2018/3/27.
 */

public class NormalDrawHelper extends DrawHelper {
    private static final String TAG = "NormalDrawHelper";

    public NormalDrawHelper(DashConfig dashConfig, Canvas canvas, Paint paint) {
        super(dashConfig, canvas, paint);
    }


    @Override
    protected void drawHorizontalLine(Canvas canvas) {
        float cellWidth = dashConfig.getCellWidth();
        float cellHeight = dashConfig.getCellHeight();
        float dashWidth = dashConfig.getDashWidth();
        float widthSize = dashConfig.getDashViewWidth();

        float totalWidth = 0;
        // save state
        canvas.save();
        float[] pts = {0, 0, cellWidth, 0};

        canvas.translate(0, cellHeight / 2);
        while (totalWidth <= widthSize) {
            canvas.drawLines(pts, paint);
            canvas.translate(cellWidth + dashWidth, 0);
            totalWidth += cellWidth + dashWidth;
        }
        // restore state
        canvas.restore();
    }


    @Override
    protected void drawVerticalLine(Canvas canvas) {
        float cellWidth = dashConfig.getCellWidth();
        float cellHeight = dashConfig.getCellHeight();
        float dashWidth = dashConfig.getDashWidth();
        float heightSize = dashConfig.getDashViewHeight();

        float totalWidth = 0;
        canvas.save();
        float[] pts = {0, 0, 0, cellWidth};

        canvas.translate(cellHeight / 2, 0);
        while (totalWidth <= heightSize) {
            canvas.drawLines(pts, paint);
            canvas.translate(0, cellWidth + dashWidth);
            totalWidth += cellWidth + dashWidth;
        }
        canvas.restore();
    }
}
