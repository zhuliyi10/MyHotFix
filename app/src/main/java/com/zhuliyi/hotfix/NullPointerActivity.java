

package com.zhuliyi.hotfix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NullPointerActivity extends AppCompatActivity {

    private TextView text;
    private String nullStr=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_null_pointer);
        text= (TextView) findViewById(R.id.text);
        text.setText(nullStr.length());
//        if(null!=null) {
//            text.setText(nullStr.length());
//        }
    }
}
