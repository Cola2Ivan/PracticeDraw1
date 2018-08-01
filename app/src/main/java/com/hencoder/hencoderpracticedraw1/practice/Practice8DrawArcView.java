package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        int width = getWidth();
        int height = getHeight();
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(width/2-height/4, height/2 -height/8, width/2 + height/4, height/2 + height/8,
                10,160,false,mPaint);
        canvas.drawArc(width/2-height/4, height/2 -height/8, width/2 + height/4, height/2 + height/8,
                250,90,true,mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(width/2-height/4, height/2 -height/8, width/2 + height/4, height/2 + height/8,
                180,60,false,mPaint);
    }
}
