package com.abc.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

import com.abc.testapp.R;


/**
 * Created by Asmita on 26-04-2016.
 */
public class CustomButton extends AppCompatButton
{
    private Typeface tf;
    public  final String DEFAULT_FONT = "fonts/OpenSans-Regular.ttf";
    public CustomButton(Context context)
    {
        super(context);
        if (!isInEditMode())
            init(null);
    }
    public CustomButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        if (!isInEditMode())
            init(attrs);
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyle)
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