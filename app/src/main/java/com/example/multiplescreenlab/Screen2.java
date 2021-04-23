package com.example.multiplescreenlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {
    private String name;
    private TextView numText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.nameTV);
        Intent intent = this.getIntent();
        name = intent.getStringExtra("name");
        nameTV.setText(name);

        int num = Singleton.num;
        numText = this.findViewById(R.id.numberTV);
        this.numText.setText(num + "");


    }

    public void onScreen3ButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        i.putExtra("name", this.name);
        this.startActivity(i);
    }
}