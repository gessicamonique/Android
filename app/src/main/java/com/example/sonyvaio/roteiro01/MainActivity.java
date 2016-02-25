package com.example.sonyvaio.roteiro01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTexto = (TextView)findViewById(R.id.texto);
        Bundle b = getIntent().getExtras();
        String texto = b.getString("nome");
        mTexto.setText("Olá," + " " + texto + " " + "seja bem-vindo(a)!");
    }
}


