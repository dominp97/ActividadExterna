package com.pmdm.actividadexterna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    public static final int SELECCIONA_PROVINCIA = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onStart(){
        super.onStart();
        Log.w("ON START", "HACEMOS START MAIN---------------------------");
    }

    protected void onRestart(){
        super.onRestart();
        Log.w("ON RESTART", "HACEMOS RESTART MAIN---------------------------");
    }

    protected void onResume(){
        super.onResume();
        Log.w("ON RESUME", "HACEMOS RESUME MAIN---------------------------");
    }

    protected void onPause(){
        super.onPause();
        Log.w("ON PAUSE", "HACEMOS PAUSE MAIN---------------------------");
    }

    protected void onStop(){
        super.onStop();
        Log.w("ON STOP", "HACEMOS STOP MAIN---------------------------");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w("ON DESTROY", "HACEMOS DESTROY MAIN---------------------------");
    }

    public void pulsado(View v){
        Intent intent = new Intent(this, Selecciona.class);
        startActivityForResult(intent,SELECCIONA_PROVINCIA);
    }

    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data)
    {
        TextView t=(TextView)findViewById(R.id.textView);

        if (requestCode == SELECCIONA_PROVINCIA) {
            if (resultCode == RESULT_OK) {
                // se seleccionó correctamente la provincia
                t.setText("Se ha seleccionado:\n"+data.getStringExtra("PROVINCIA"));
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
