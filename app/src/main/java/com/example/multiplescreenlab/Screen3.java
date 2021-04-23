package com.example.multiplescreenlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity {
    private TextView numText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        numText = this.findViewById(R.id.numberTV2);
        int num = Singleton.num;
        this.numText.setText(num+ "");

    }
}