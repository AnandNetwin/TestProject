package com.abc.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;



/**
 * Created by Asmita on 26-04-2016.
 */
public class CustomCheckbox extends AppCompatCheckBox
{
    private Typeface tf;
    public  final String DEFAULT_FONT = "fonts/Roboto-Light.ttf";
    public CustomCheckbox(Context context)
    {
        super(context);
        if (!isInEditMode())
            init(null);
    }
    public CustomCheckbox(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        if (!isInEditMode())
            init(attrs);
    }

    public CustomCheckbox(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        if (!isInEditMode())
            init(attrs);
    }

    private void init(AttributeSet attrs)
    {
        if(attrs!=null)
        {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.CustomTextView);
            String fontName = a.getString(R.styleable.CustomTextView_font);
            if (fontName != null)
                tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/"+fontName+".TTF");
            else
                tf = Typeface.createFromAsset(getContext().getAssets(),DEFAULT_FONT);  //default font for app

            a.recycle();
            if(tf!=null)
                setTypeface(tf);
        }
    }
}