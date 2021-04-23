package com.example.multiplescreenlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText numInput;
    private EditText name;
    private String nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.name = this.findViewById(R.id.editName);
        this.numInput = this.findViewById(R.id.editNumber);
    }
    public void onScreen2ButtonClicked(View v)
    {
        //launch the next screen
        Intent i = new Intent(this, Screen2.class);
        String nameText = name.getText().toString();
        i.putExtra("name", ""+ nameText);
        String num1 = this.numInput.getText().toString();
        int num = Integer.parseInt(num1);
        Singleton.num = num;
        this.startActivity(i);
    }
}