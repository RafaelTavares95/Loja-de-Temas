package edu.ifpb.pdm.lojadetemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetalhesCategoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_categoria);
        TextView text=(TextView)findViewById(R.id.categoriaText);
        text.setText(getIntent().getCharSequenceExtra("title"));
        TextView text2=(TextView)findViewById(R.id.textView3);
        text2.setText(getIntent().getCharSequenceExtra("name"));
    }
    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaJethrodt(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title", "Jethro Tull");
        intent1.putExtra("name", "Tema Jethro Tull");
        intent1.putExtra("content", "Tema personalizado da banda de Rock Inglesa Jethro Tull");
        startActivity(intent1);
    }

    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaLeddt(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Led Zeppelin");
        intent1.putExtra("name","Tema Led Zeppelin");
        intent1.putExtra("content","Tema personalizado da banda de Rock Led Zeppelin");
        startActivity(intent1);
    }
}
