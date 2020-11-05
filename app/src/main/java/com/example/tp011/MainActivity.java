package com.example.tp011;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "le nom du fichier de la mise en page de l'activite principaleest: activity_main.xml");
        Log.d(TAG, " le nom de la ressource chaîne qui specifie le nom de l'application est : app_name");
        Log.d(TAG, "l'outil utiliser pour creer un nouvel emulateur est : AVD Manager");
        Log.d(TAG, " on voie la mention 'MainActivity layout is complete' dans le volet Logcat si le menu de niveau Log est regle sur : Info");


    }
}