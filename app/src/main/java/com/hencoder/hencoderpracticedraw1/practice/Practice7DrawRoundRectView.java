package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils.PxDpUtil;

public class Practice7DrawRoundRectView extends View {

    private Paint mPaint = new Paint();

    public Practice7DrawRoundRectView(Context context) {
        super(context);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice7DrawRoundRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.BLACK);
//        练习内容：使用 canvas.drawRoundRect() 方法画圆角矩形
        int width = getWidth();
        int height = getHeight();
        int radius = PxDpUtil.dip2px(getContext(),20);
        canvas.drawRoundRect(width/2-height/4, height/2 -height/8, width/2 + height/4, height/2 + height/8,radius , radius,mPaint);
    }
}
