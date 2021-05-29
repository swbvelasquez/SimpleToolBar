package com.tutoriales.simpletoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar tlbMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tlbMain=findViewById(R.id.tlbMain);
        setSupportActionBar(tlbMain);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        boolean result=true;
        if(item.getItemId()==R.id.optContacts){

        }else{
            if(item.getItemId()==R.id.optProfile){

            }else{
                if(item.getItemId()==R.id.optGallery){

                }else{
                    result=super.onOptionsItemSelected(item);
                }
            }
        }
        return result;
    }
}