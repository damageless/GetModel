package com.damagedapps.getmodel;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.widget.TextView;

import java.io.ObjectStreamClass;

public class GetModel extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        TextView modelNo = (TextView) findViewById(R.id.model_no);
        TextView productNo = (TextView) findViewById(R.id.product_no);
        TextView brandNo = (TextView) findViewById(R.id.brand_no);
        TextView deviceNo = (TextView) findViewById(R.id.device_no);
        modelNo.setText(Build.MODEL);
        productNo.setText(Build.PRODUCT);
        brandNo.setText(Build.BRAND);
        deviceNo.setText(Build.DEVICE);
    }
}
