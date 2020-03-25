package com.example.practicastringsxmlv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //----------------------------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuopciones,menu);
        return true;
    }

    //----------------------------------------------------------
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id==R.id.opc1){
            Toast.makeText(this,R.string.mensaje_1,Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.opc2){
            Toast.makeText(this,R.string.mensaje_2,Toast.LENGTH_SHORT).show();
        }
        if (id==R.id.opc3){
            Toast.makeText(this,R.string.mensaje_3,Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
