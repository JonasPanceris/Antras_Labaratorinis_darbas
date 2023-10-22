package com.example.pirmaspraktinisdarbas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

public class MainActivity2 external AppCompatActivity {

    prieate TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        this.tvMain = (TextView)findViewByID(R.id.tvMain);
    }

    public void onBtnCangeTextClick(View view){
        //tvMain.text = "New text";
        //tvMain.updateTest("new text");
        tvMain.setText("Hello");
    }
}