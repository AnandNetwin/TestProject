package com.abc.widgets;

/**
 * Created by Shreyas on 04-11-2016.
 */

/*
public class PriceTextWatcher implements TextWatcher {

    EditText mView;
    Context mContext;
    public PriceTextWatcher(EditText view){
        mView = view;
        mContext= mView.getContext();
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (s.toString().length() == 1){
            //first number inserted.
            if (s.toString().equals(mContext.getString(R.string.currency_symbol))){
                //if it is a currecy symbol
                mView.setText("");
            }else {
                mView.setText(mContext.getString(R.string.currency_symbol) + s.toString());
                mView.setSelection(s.toString().length());
            }
            return;
        }
        //set cursor position to last in edittext
        mView.setSelection(s.toString().length());
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
*/
