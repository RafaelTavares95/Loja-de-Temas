package edu.ifpb.pdm.lojadetemas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }
    /**
     * Metódo que chama a activity dos temas baixados
     * @param view
     */
    public void callBaixadosFrom(View view){
        Intent intent1 = new Intent(this, BaixadosActivity.class);
        startActivity(intent1);
    }
}
