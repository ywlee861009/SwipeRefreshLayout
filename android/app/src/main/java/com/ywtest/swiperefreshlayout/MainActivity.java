package com.ywtest.swiperefreshlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
    }


    /**
     * 뷰 초기화
     */
    private void initView() {
        setContentView(R.layout.activity_main);
    }
}
