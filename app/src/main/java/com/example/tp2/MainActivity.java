package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

// Import Bundle and Log
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

// Import for Button
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // ### LES VARS ###
    // # val Random #
    private Random r;
    private int choix, valeurMin = 1, valeurMax = 100;

    // ### LES OVERRIDES DE METHODES ###
    // # ON CREATE #
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // send Log message
        Log.w("P2","onCreate");

        // Button GALEA
        Button galea=(Button) findViewById(R.id.gAlea);
        galea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                r = new Random();
                choix = valeurMin + r.nextInt(valeurMax - valeurMin+1);
            }
        });
        // Button AALEA
        Button aalea=(Button) findViewById(R.id.aAlea);
        aalea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(
                        getApplicationContext(),
                        String.valueOf(choix),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
    // # ON START #
    @Override
    protected void onStart(){
        super.onStart();
        Log.w("P2","onStart");
    }
    // # ON RESTART #
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.w("P2","onRestart");
    }
    // # ON RESUME #
    @Override
    protected void onResume(){
        super.onResume();
        Log.w("P2","onResume");
    }
    // # ON PAUSE #
    @Override
    protected void onPause(){
        super.onPause();
        Log.w("P2","onPause");
    }
    // # ON STOP #
    @Override
    protected void onStop(){
        super.onStop();
        Log.w("P2","onStop");
    }
    // # ON DESTROY #
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w("P2","onDestroy");
    }
    // # ON SAVE INSTANCE STATE #
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("choix", choix);
        Log.w("P2","onSaveInstanceState");
    }
    // # ON RESTORE INSTANCE STATE #
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        choix = savedInstanceState.getInt("choix");
        Log.w("P2","onRestoreInstanceState");
    }
}
