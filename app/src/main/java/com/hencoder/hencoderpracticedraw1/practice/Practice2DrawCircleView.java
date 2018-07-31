package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils.PxDpUtil;

public class Practice2DrawCircleView extends View {

    private Paint mPaint = null;

    public Practice2DrawCircleView(Context context) {
        this(context,null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        int width = getMeasuredWidth();
        int height = getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int devider = PxDpUtil.dip2px(getContext(),20f);

        int radius = (Math.min(width - paddingLeft - paddingRight-devider,height - paddingTop - paddingBottom)-devider )/5;

        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width/2 - devider - radius, height/2 - radius - devider, radius,mPaint);

        mPaint.reset();
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(width/2 + devider + radius , height/2 - radius - devider, radius,mPaint);

        mPaint.reset();
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(width/2 - devider - radius, height/2 + radius + devider , radius,mPaint);

        mPaint.reset();
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(PxDpUtil.dip2px(getContext(),20f));
        canvas.drawCircle(width/2 + devider + radius, height/2 + radius + devider , radius,mPaint);


    }

}
