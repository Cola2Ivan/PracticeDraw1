package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils.PxDpUtil;

public class Practice6DrawLineView extends View {

    private Paint mPaint = new Paint();

    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.BLACK);
//        练习内容：使用 canvas.drawLine() 方法画直线
        int width = getWidth();
        int height = getHeight();
        mPaint.setStrokeWidth(PxDpUtil.dip2px( getContext(), 3f));
        canvas.drawLine(width/2-height/4, height/2 -height/8, width/2 + height/4, height/2 + height/8,mPaint);
    }
}
