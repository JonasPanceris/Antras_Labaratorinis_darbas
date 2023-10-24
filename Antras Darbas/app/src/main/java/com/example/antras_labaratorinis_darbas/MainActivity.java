package com.example.antras_labaratorinis_darbas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edUserInput;
    Button butCount;
    TextView tvMain;
    Spinner spSelectionOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edUserInput=findViewById(R.id.edUserInput);
        this.butCount=findViewById(R.id.butCount);
        this.tvMain=findViewById(R.id.tvMain);

        this.spSelectionOptions = (Spinner) findViewById(R.id.spSelectionOptions);
        ArrayAdepter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.planets_array,
                android.R.layaut.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layaut.simple_spinner_item);
        spinner.setAdapter(adapter);
    }

    public void onButCountClick (View view){
        if(this.spSelectionOptions.getSelectedItem().toString() == "Symbols") {

            int result = TextCounter.countSymbols(this.edUserInput.getText().toString());
            log.i("CountResult", String.valueOf(result));
            this.tvMain.setText(String.valueOf(result));
        };
    }
    else{
        Toast.makeText(this,"Not implemented", Toast.LENGTH_LONG).show();
    }

}