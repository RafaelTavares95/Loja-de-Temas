package edu.ifpb.pdm.lojadetemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class TemaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema);
        TextView text=(TextView)findViewById(R.id.textView);
        text.setText(getIntent().getCharSequenceExtra("title"));
        TextView text2=(TextView)findViewById(R.id.textView2);
        text2.setText(getIntent().getCharSequenceExtra("name"));
        TextView text3=(TextView)findViewById(R.id.conteudo);
        text3.setText(getIntent().getCharSequenceExtra("content"));
    }
    /**
     * Metódo que exibe uma mensagem informando o download
     * @param view
     */
    public void callAviso(View view){
        Toast.makeText(this, "Baixando Tema", Toast.LENGTH_LONG).show();
    }
}
