package com.shadow.zyw.sdu.viewtest;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by shadow on 2015/6/26.
 */
public class TitleView extends FrameLayout{
    private Button btn_left;
    private TextView title_text;

    public TitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        title_text = (TextView) findViewById(R.id.title_text);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_left.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });

    }

    public void setTitle_text(String text) {

        title_text.setText(text);
    }

    public void setBtnLeftText(String text) {
        btn_left.setText(text);
    }

    public void setBtnLeftText(OnClickListener onClickListener) {
        btn_left.setOnClickListener(onClickListener);
    }
}
