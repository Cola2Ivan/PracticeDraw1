package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils.PxDpUtil;

public class Practice10HistogramView extends View {

    private Paint mPaint = new Paint();

    private Path mPath = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        canvas.drawLine(100,50,100,600,mPaint);
        mPath.moveTo(100,600);
        mPath.lineTo(7*100 + 8 *10 ,600);
        canvas.drawLine(100,600,7*100 + 8 *10,600,mPaint);
        mPaint.setTextSize(30);
        canvas.drawTextOnPath("text",mPath,15,15,mPaint);
    }
}
