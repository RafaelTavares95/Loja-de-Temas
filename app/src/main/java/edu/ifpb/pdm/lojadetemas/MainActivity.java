package edu.ifpb.pdm.lojadetemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    /**
     * Metódo que chama a activity do perfil
     * @param view
     */
    public void callPerfil(View view){
        Intent intent1 = new Intent(this, PerfilActivity.class);
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity com o menu de categorias
     * @param view
     */
    public void callCategorias(View view){
        Intent intent1 = new Intent(this, CategoriasActivity.class);
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity de temas baixados
     * @param view
     */
    public void callBaixados(View view){
        Intent intent1 = new Intent(this, BaixadosActivity.class);
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaLed(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Led Zeppelin");
        intent1.putExtra("name","Tema Led Zeppelin");
        intent1.putExtra("content","Tema personalizado da banda de Rock Led Zeppelin");
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaZumbi(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Zumbi");
        intent1.putExtra("name","Tema de Zumbi");
        intent1.putExtra("content","Tema de zumbi sobre o filme a madrugada dos mortos.");
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaJethro(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Jethro Tull");
        intent1.putExtra("name","Tema Jethro Tull");
        intent1.putExtra("content","Tema personalizado da banda de Rock Inglesa Jethro Tull");
        startActivity(intent1);
    }
    /**
     * Metódo que chama a activity do tema
     * @param view
     */
    public void callTemaCoisa(View view){
        Intent intent1 = new Intent(this, TemaActivity.class);
        intent1.putExtra("title","Abstrato");
        intent1.putExtra("name","Tema Abstrato");
        intent1.putExtra("content","Tema Abstrato bem doido.");
        startActivity(intent1);
    }
}
