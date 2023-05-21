package igor.moreira.codeca;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;


public class Nova extends AppCompatActivity {

    private Spinner tiposdeservico;

    String [] servicos = {"teste01","teste02","teste03"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nova);
        tiposdeservico = findViewById(R.id.tiposdeservico);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item,servicos);
        tiposdeservico.setAdapter(adapter);


    }
}
