package com.jiakaiyang.xdashview.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.jiakaiyang.xdashview.lib.helper.DrawHelper;
import com.jiakaiyang.xdashview.lib.helper.DrawHelperFactory;

/**
 * Created by jia on 2018/3/27.
 */

public class XDashView extends View {
    private static final String TAG = "XDashView";

    private DashConfig dashConfig;
    private DrawHelper drawHelper;


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
        // TODO: 2018/3/27 init attrs and create DashConfig
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (drawHelper == null) {
            drawHelper = DrawHelperFactory.create(dashConfig, canvas);
        }

        drawHelper.draw();
    }
}
