package com.cleo.manalili_fquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
    }


    public void loginUser(View view){
        SharedPreferences.Editor editor = preferences.edit();
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById((R.id.password));
        editor.putString("username", username.getText().toString());
        editor.putString("password", password.getText().toString());
        editor.commit();
        editor.apply();
        Intent nextpage = new Intent(this, Main2Activity.class);
        startActivity(nextpage);
    }

    public void rememberMe(View view){
        SharedPreferences.Editor editor = preferences.edit();
        EditText username = (EditText)findViewById(R.id.username);
        EditText password = (EditText)findViewById((R.id.password));
        editor.putString("username", username.toString());
        editor.putString("password", password.toString());
        editor.apply();

    }

}
