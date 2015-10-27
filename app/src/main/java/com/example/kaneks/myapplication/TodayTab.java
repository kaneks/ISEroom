package com.example.kaneks.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class TodayTab extends AppCompatActivity {

    private EditText setTime;
    private String time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_tab);
        setTime = (EditText) findViewById(R.id.editText);
        time = setTime.getText().toString();

    }
}