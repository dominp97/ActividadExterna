package com.pmdm.actividadexterna;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Selecciona extends ListActivity implements ListView.OnItemClickListener{


    public void onItemClick(AdapterView<?> a, View view, int position, long id){
        Intent i=new Intent();
        i.putExtra("PROVINCIA",a.getItemAtPosition(position).toString());
        setResult(RESULT_OK,i);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String [] elementos={"Toledo","Ciudad Real","Cuenca","Guadalajara","Albacete"};
        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecciona);

        ListView l=(ListView)findViewById(android.R.id.list);
        adaptador=new ArrayAdapter<String>(this,R.layout.fila,elementos);
        setListAdapter(adaptador);
        l.setOnItemClickListener(this);
        Log.w("ON CREATE", "HACEMOS CREATE SELECCIONA---------------------------");
    }

    protected void onStart(){
        super.onStart();
        Log.w("ON START", "HACEMOS START SELECCIONA---------------------------");
    }

    protected void onRestart(){
        super.onRestart();
        Log.w("ON RESTART", "HACEMOS RESTART SELECCIONA---------------------------");
    }

    protected void onResume(){
        super.onResume();
        Log.w("ON RESUME", "HACEMOS RESUME SELECCIONA---------------------------");
    }

    protected void onPause(){
        super.onPause();
        Log.w("ON PAUSE", "HACEMOS PAUSE SELECCIONA---------------------------");
    }

    protected void onStop(){
        super.onStop();
        Log.w("ON STOP", "HACEMOS STOP SELECCIONA---------------------------");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w("ON DESTROY", "HACEMOS DESTROY SELECCIONA---------------------------");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.selecciona, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
