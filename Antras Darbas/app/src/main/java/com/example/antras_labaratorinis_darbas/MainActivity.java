package com.example.antras_labaratorinis_darbas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    Button butCount;
    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput=findViewById(R.id.edUserInput);
        this.butCount=findViewById(R.id.butCount);
        this.tvMain=findViewById(R.id.tvMain);
    }

    public void onButCountClick (View view){
            int result = TextCounter.countSymbols(this.edUserInput.getText().toString());
            log.i("CountResult", String.valueOf(result));
            this.tvMain.setText(String.valueOf(result));
    }
}