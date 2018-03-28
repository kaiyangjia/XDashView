package com.jiakaiyang.xdashview.lib.helper;

import android.graphics.Canvas;
import android.graphics.Paint;

import com.jiakaiyang.xdashview.lib.DashConfig;

/**
 * Created by jia on 2018/3/27.
 * The Factory to create DrawHelper
 */

public class DrawHelperFactory {

    public static DrawHelper create(DashConfig dashConfig, Canvas canvas, Paint paint) {
        int cellType = dashConfig.getCellType();
        switch (cellType) {
            case DashConfig.CELL_TYPE_NORMAL:
                return new NormalDrawHelper(dashConfig, canvas, paint);
        }

        return null;
    }
}
