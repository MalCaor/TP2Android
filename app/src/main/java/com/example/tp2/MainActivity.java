package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    // ### LES OVERRIDES DE METHODES ###
    // # ON CREATE #
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w("P2","onCreate");
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
        Log.w("P2","onSaveInstanceState");
    }
    // # ON RESTORE INSTANCE STATE #
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.w("P2","onRestoreInstanceState");
    }
}
