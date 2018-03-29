package com.jiakaiyang.xdashview.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.jiakaiyang.xdashview.lib.helper.DrawHelper;
import com.jiakaiyang.xdashview.lib.helper.DrawHelperFactory;

/**
 * Created by jia on 2018/3/27.
 * X DashView
 */

public class XDashView extends View {
    private static final String TAG = "XDashView";

    public static final int DEFAULT_DASH_TYPE = DashConfig.CELL_TYPE_NORMAL;
    public static final int DEFAULT_DASH_WIDTH = 100;
    public static final int DEFAULT_CELL_WIDTH = 100;
    public static final int DEFAULT_CELL_HEIGHT = 10;
    public static final int DEFAULT_LINE_COLOR = 0xff888888;
    public static final int DEFAULT_DASH_ORIENTATION = DashConfig.ORIENTATION_HORIZONTAL;

    private DashConfig dashConfig;
    private DrawHelper drawHelper;

    private Paint paint;


    public XDashView(Context context) {
        this(context, null, 0);
    }

    public XDashView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public XDashView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr, 0);
    }


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public XDashView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs, defStyleAttr, defStyleRes);
    }

    private void init(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        dashConfig = new DashConfig();

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.XDashView);
        int cellType = typedArray.getInt(R.styleable.XDashView_dashType, DEFAULT_DASH_TYPE);
        dashConfig.setCellType(cellType);

        float dashWidth = typedArray.getDimension(R.styleable.XDashView_dashWidth, DEFAULT_DASH_WIDTH);
        dashConfig.setDashWidth(dashWidth);

        float cellHeight = typedArray.getDimension(R.styleable.XDashView_cellHeight, DEFAULT_CELL_HEIGHT);
        dashConfig.setCellHeight(cellHeight);

        float cellWidth = typedArray.getDimension(R.styleable.XDashView_cellWidth, DEFAULT_CELL_WIDTH);
        dashConfig.setCellWidth(cellWidth);

        int lineColor = typedArray.getColor(R.styleable.XDashView_lineColor, DEFAULT_LINE_COLOR);
        dashConfig.setLineColor(lineColor);

        int dashOrientation = typedArray.getInteger(R.styleable.XDashView_dashOrientation, DEFAULT_DASH_ORIENTATION);
        dashConfig.setOrientation(dashOrientation);
        typedArray.recycle();

        // create paint
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(lineColor);
        paint.setStrokeWidth(cellHeight);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int width = MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft() - getPaddingRight();
        int height = MeasureSpec.getSize(heightMeasureSpec - getPaddingTop() - getPaddingBottom());

        dashConfig.setDashViewWidth(width);
        dashConfig.setDashViewHeight(height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (drawHelper == null) {
            drawHelper = DrawHelperFactory.create(dashConfig, canvas, paint);
        }

        drawHelper.draw();
    }
}
