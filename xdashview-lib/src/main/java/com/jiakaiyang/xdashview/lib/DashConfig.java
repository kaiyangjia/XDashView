package com.jiakaiyang.xdashview.lib;

import android.support.annotation.ColorInt;

/**
 * Created by jia on 2018/3/26.
 * Config for the DashView
 */

public class DashConfig {
    /* Orientation of DashView */
    public static final int ORIENTATION_VERTICAL = 1;

    public static final int ORIENTATION_HORIZONTAL = 2;


    /* Cell type for DashView */
    public static final int CELL_TYPE_NORMAL = 100;


    private int orientation;
    private int cellType;

    /* dash */
    // "width" and "height" will not change by the ORIENTATION of this Line
    private float dashWidth;
    private float dashHeight;
    private float cellWidth;
    private float cellHeight;
    private float lineHeight;

    // dash view size
    private float dashViewWidth;
    private float dashViewHeight;

    // normal type attrs
    private @ColorInt
    int lineColor;


    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getCellType() {
        return cellType;
    }

    public void setCellType(int cellType) {
        this.cellType = cellType;
    }

    public float getDashWidth() {
        return dashWidth;
    }

    public void setDashWidth(float dashWidth) {
        this.dashWidth = dashWidth;
    }

    public float getDashHeight() {
        return dashHeight;
    }

    public void setDashHeight(float dashHeight) {
        this.dashHeight = dashHeight;
    }

    public float getCellWidth() {
        return cellWidth;
    }

    public void setCellWidth(float cellWidth) {
        this.cellWidth = cellWidth;
    }

    public float getCellHeight() {
        return cellHeight;
    }

    public void setCellHeight(float cellHeight) {
        this.cellHeight = cellHeight;
    }

    public float getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(float lineHeight) {
        this.lineHeight = lineHeight;
    }

    public float getDashViewWidth() {
        return dashViewWidth;
    }

    public void setDashViewWidth(float dashViewWidth) {
        this.dashViewWidth = dashViewWidth;
    }

    public float getDashViewHeight() {
        return dashViewHeight;
    }

    public void setDashViewHeight(float dashViewHeight) {
        this.dashViewHeight = dashViewHeight;
    }

    public int getLineColor() {
        return lineColor;
    }

    public void setLineColor(int lineColor) {
        this.lineColor = lineColor;
    }
}
