package com.jiakaiyang.xdashview.lib;

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
    private float callHeight;
    private float lineHeight;


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
}
