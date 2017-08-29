package com.example.francisco.w5d1.icons;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class FontAwesome extends android.support.v7.widget.AppCompatTextView {


    public FontAwesome(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public FontAwesome(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FontAwesome(Context context) {
        super(context);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"typicons_v207.ttf");
        setTypeface(tf);
        tf = Typeface.createFromAsset(getContext().getAssets(),"fontawesome.ttf");
        setTypeface(tf);
        tf = Typeface.createFromAsset(getContext().getAssets(),"materialicons_regular.ttf");
        setTypeface(tf);

    }

}