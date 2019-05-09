package com.example.vivetumoto;

import android.accounts.AccountsException;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MostrarRegistros extends AppCompatActivity {

    TextView IMarca, IModelo, ICilin, IAno, IAceite;
    Button Ok, Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_registros);

        IMarca = (TextView) findViewById(R.id.MMarca);
        IModelo = (TextView) findViewById(R.id.MModelo);
        ICilin = (TextView) findViewById(R.id.MCilin);
        IAno = (TextView) findViewById(R.id.MAno);
        IAceite = (TextView) findViewById(R.id.MAceite);

        Ok = (Button) findViewById(R.id.butCorr);

        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarRegistros.this, MainActivity.class);
                startActivity(intent);
            }
        });

        MostrarRegistro();
    }

    private void MostrarRegistro() {
        Bundle datos    = this.getIntent().getExtras();
        String Marca    = datos.getString("Mar");
        String Modelo   = datos.getString("Mod");
        String Cilin    = datos.getString("Cil");
        String Ano      = datos.getString("An");
        String Aceite   = datos.getString("Ace");

        IMarca.setText(Marca);
        IModelo.setText(Modelo);
        ICilin.setText(Cilin);
        IAno.setText(Ano);
        IAceite.setText(Aceite);
    }
}
