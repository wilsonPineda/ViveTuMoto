package com.example.vivetumoto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Marca, Modelo, Cilin, Ano, Aceite;
    Button Reg, Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Marca   = (EditText)findViewById(R.id.EditMarca);
        Modelo  = (EditText)findViewById(R.id.EditModelo);
        Cilin   = (EditText)findViewById(R.id.EditCilin);
        Ano     = (EditText)findViewById(R.id.EditAno);
        Aceite  = (EditText)findViewById(R.id.EditAceite);

        Reg     = (Button)findViewById(R.id.buttonReg);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Mar = Marca.getText().toString();
                String Mod = Modelo.getText().toString();
                String Cil = Cilin.getText().toString();
                String An = Ano.getText().toString();
                String Ace = Aceite.getText().toString();

                Intent i = new Intent(MainActivity.this, MostrarRegistros.class);

                i.putExtra("Mar", Mar);
                i.putExtra("Mod", Mod);
                i.putExtra("Cil", Cil);
                i.putExtra("An", An);
                i.putExtra("Ace", Ace);

                startActivity(i);
            }
        });
    }
}
