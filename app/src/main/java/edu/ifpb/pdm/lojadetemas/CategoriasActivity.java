package edu.ifpb.pdm.lojadetemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CategoriasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }
    /**
     * Metódo que chama a activity com os detalhes de cada categoria
     * @param view
     */
    public void callCategoriasDetalhesRock(View view){
        Intent intent = new Intent(this, DetalhesCategoriaActivity.class);
        intent.putExtra("title","Rock");
        intent.putExtra("name","Temas de Bandas de Rock");
        startActivity(intent);
    }

    /**
     * Metódo que chama a activity com os detalhes de cada categoria
     * @param view
     */
    public void callCategoriasDetalhesZumbi(View view){
        Intent intent = new Intent(this, DetalhesCategoriaActivity.class);
        intent.putExtra("title","Zumbi");
        intent.putExtra("name","Temas de Zumbi");
        startActivity(intent);
    }

    /**
     * Metódo que chama a activity com os detalhes de cada categoria
     * @param view
     */
    public void callCategoriasDetalhesAbstrato(View view){
        Intent intent = new Intent(this, DetalhesCategoriaActivity.class);
        intent.putExtra("title","Abstrato");
        intent.putExtra("name","Temas de Coisas Abstratas");
        startActivity(intent);
    }
}
