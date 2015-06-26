package com.shadow.zyw.sdu.viewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by shadow on 2015/6/26.
 */
public class CountView extends View implements View.OnClickListener{
    private Paint paint;
    private Rect rect;
    private int mount;

    public CountView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rect = new Rect();
        setOnClickListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.BLUE);
        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);
        paint.setColor(Color.YELLOW);
        paint.setTextSize(30);
        String text = String.valueOf(mount);
        paint.getTextBounds(text,0,text.length(),rect);
        float width = rect.width();
        float height = rect.height();
        canvas.drawText(text,getWidth()/2-width/2,getHeight()/2+height/2,paint);
    }

    @Override
    public void onClick(View v) {
        mount++;
        invalidate();

    }
}
