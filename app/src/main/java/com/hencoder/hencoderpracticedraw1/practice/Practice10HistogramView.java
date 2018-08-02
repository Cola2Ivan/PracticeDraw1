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

    private String[] x_text = new String[]{"Froyo","GB","ICS","JB","KitKat","L","M"};

    private int[] y_percent = new int[]{1, 2, 6, 25, 61, 134, 153};

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
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setAntiAlias(true);
        canvas.drawLine(100,50,100,600,mPaint);
//        mPath.moveTo(100,600);
//        mPath.lineTo(7*100 + 8 *10 ,600);
        canvas.drawLine(100,600,7*100 + 8 *10 + 150,600,mPaint);
        mPaint.setTextSize(20);
        mPaint.setTextAlign(Paint.Align.CENTER);
        int curX = 100+10;
        int curY = 600;

        for (int i = 0; i < x_text.length; i++) {
            mPath.moveTo(curX,curY);
            mPath.lineTo(curX + 100  ,curY );
            mPaint.setColor(Color.GREEN);
            canvas.drawRect(curX, curY - y_percent[i] -5, curX + 100, curY -5, mPaint);
            mPaint.setColor(Color.WHITE);
            canvas.drawTextOnPath(x_text[i] , mPath, 0, 30,mPaint);

            mPath.reset();
            curX = curX + 10 + 100 ;
        }

        mPaint.setTextSize(30);
        canvas.drawText("直方图", (6 * 100 +  8 * 10 + 350 ) / 2, 700,mPaint );

    }
}
