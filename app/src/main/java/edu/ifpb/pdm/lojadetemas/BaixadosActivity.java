package edu.ifpb.pdm.lojadetemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BaixadosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baixados);
    }

    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaZumbibx(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Zumbi");
        intent1.putExtra("name","Tema de Zumbi");
        intent1.putExtra("content", "Tema de zumbi sobre o filme a madrugada dos mortos.");
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaJethrobx(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Jethro Tull");
        intent1.putExtra("name","Tema Jethro Tull");
        intent1.putExtra("content","Tema personalizado da banda de Rock Inglesa Jethro Tull");
        startActivity(intent1);
    }
}
