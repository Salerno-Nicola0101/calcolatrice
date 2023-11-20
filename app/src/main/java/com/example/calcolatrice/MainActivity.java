package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button Calcola;
    private EditText primo;
    private EditText secondo;
    private TextView Risultato;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calcola = (Button) findViewById(R.id.Calcola);
        Risultato = (TextView)findViewById(R.id.Calcola);
        primo = (EditText)findViewById(R.id.primo);
        secondo = (EditText)findViewById(R.id.secondo);

        Button btnSaluta = (Button)findViewById(R.id.calcola);
        final TextView txtViewSaluta= (TextView)findViewById(R.id.textView);
        btnSaluta.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String strNum1 = primo.getText().toString();
                String strNum2 = secondo.getText().toString();
                int n1 = Integer.parseInt(strNum1);
                int n2 = Integer.parseInt(strNum2);
                int res = n1 + n2 ;
                String strStr = String.valueOf(res);
                Calcola.setText(strStr);
            }
        });

    }

}
