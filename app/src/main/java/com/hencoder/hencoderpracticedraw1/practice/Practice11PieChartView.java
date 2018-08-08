package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils.PxDpUtil;

public class Practice11PieChartView extends View {


    private static int[] data = new int[]{2, 3, 6, 25, 61, 134, 153};
    private static int [] color = new int[]{Color.RED, Color.GREEN, Color.YELLOW,Color.BLUE,Color.GRAY,Color.BLACK,Color.DKGRAY};
    private static int total = 0;

    private Paint mPaint = new Paint();
    private Rect rect = new Rect();
    private Path mPath = new Path();

    static {
        for (int i = 0; i < data.length;i++){
            total = total + data[i];
        }
    }


    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        int width = getWidth();
        int height = getHeight();

        int radius = (Math.min(width,height) - 2 * PxDpUtil.dip2px(getContext(),10))/2;
        int top = height/2 - radius;
        int left = width/2 - radius;
        int bottom = height/2 + radius;
        int right = width/2 + radius;

        rect.left = left;
        rect.top = top;
        rect.right = right;
        rect.bottom = bottom;
        int startAngle = 0;
        int sweepAngle = 0;
        int deviderSweepAngle = 2;
        int totalAngle = 360 - data.length * deviderSweepAngle;
        int curAngle = 0;
        for (int i = 0; i < data.length;i++){
            startAngle = startAngle + sweepAngle + deviderSweepAngle;
            sweepAngle = totalAngle * data[i]/total;
            mPaint.setColor(color[i]);
            canvas.drawArc(left,top,right,bottom,startAngle,sweepAngle,true,mPaint);
            mPaint.setColor(Color.WHITE);
            curAngle = startAngle + sweepAngle + deviderSweepAngle;

        }
    }
}
