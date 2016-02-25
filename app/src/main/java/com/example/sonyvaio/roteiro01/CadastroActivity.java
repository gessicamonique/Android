package com.example.sonyvaio.roteiro01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {
    private EditText mNome;
    private EditText mSobrenome;
    private EditText mUsuario;
    private EditText mSenha;
    private EditText mConfirmarSenha;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        mNome = (EditText) findViewById(R.id.nome);
        mSobrenome = (EditText) findViewById(R.id.sobrenome);
        mUsuario = (EditText) findViewById(R.id.usuario);
        mSenha = (EditText) findViewById(R.id.senha);
        mConfirmarSenha = (EditText) findViewById(R.id.confirmarSenha);
        mButton = (Button) findViewById(R.id.botao);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cadastrarUsuario();
            }
        });
    }

    private void cadastrarUsuario() {
        String nome = mNome.getText().toString();
        String sobrenome = mSobrenome.getText().toString();
        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();
        String confirmarSenha = mConfirmarSenha.getText().toString();

        if(usuario.equalsIgnoreCase("gessicamonique") && ( senha.equalsIgnoreCase("123") && confirmarSenha.equalsIgnoreCase("123"))){
            Intent i = new Intent(this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("nome", nome);
            i.putExtras(bundle);
            startActivity(i);
            finish();
        }

        else{

            View focus = null;
            if(TextUtils.isEmpty(nome)){
                mNome.setError("CAMPO VAZIO");
                focus = mNome;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(sobrenome)){
                mSobrenome.setError("CAMPO VAZIO");
                focus = mSobrenome;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(usuario)){
                mUsuario.setError("CAMPO VAZIO");
                focus = mUsuario;
                focus.requestFocus();
            }
            if(TextUtils.isEmpty(senha)){
                mSenha.setError("CAMPO VAZIO");
                focus = mSenha;
                focus.requestFocus();

            }
            if(TextUtils.isEmpty(confirmarSenha)){
                mConfirmarSenha.setError("CAMPO VAZIO");
                focus = mUsuario;
                focus.requestFocus();

            }



        }


    }
}

