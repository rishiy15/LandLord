package com.example.aurav.myapplication.Fragments;

/**
 * Created by jason on 7/21/16.
 */
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class SingleTextView extends TextView {

    public SingleTextView(Context context) {
        super(context);
        init();
    }

    public SingleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SingleTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    protected void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "font/Ubuntu-Regular.ttf");
        setTypeface(tf);
    }
}
