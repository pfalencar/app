package com.example.aluno.androidaula130319_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText usuario;
    private EditText senha;
    private Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.txtLogin);
        senha = (EditText) findViewById(R.id.txtSenha);
        botao = (Button) findViewById(R.id.btnEntrar);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = usuario.getText().toString();
                String pass = senha.getText().toString();
                String admin = "pati";
                String senhadmin = "senha";
                if (txt.equals(admin) && pass.equals(senhadmin)){
                    Toast.makeText(MainActivity.this, "login aceito", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Senha ou usuario invalido", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}






