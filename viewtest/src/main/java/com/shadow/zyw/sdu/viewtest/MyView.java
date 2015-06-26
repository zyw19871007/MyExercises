package com.shadow.zyw.sdu.viewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by shadow on 2015/6/26.
 */
public class MyView extends View{
    private Paint paint;
    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.parseColor("#ff0000"));
        canvas.drawRect(0,0,100,100,paint);
        canvas.drawText("hello myview",100,100,paint);

    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }
}
