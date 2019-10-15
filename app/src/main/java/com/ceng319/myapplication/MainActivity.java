package com.ceng319.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.ceng319.myapplication.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {


    Button btnLogin = (Button) findViewById(R.id.button_1);
    Button btnRegister= (Button) findViewById(R.id.button_2);

    /*View.OnClickListener handler = new View.OnClickListener(){

        public void onClick(View v) {

            if(v==btnLogin){
                setContentView(R.layout.activity_login);
                // doStuff
               // Intent intentMain = new Intent(this, LoginActivity.class);
                //startActivity(intentMain);
            }

            if(v==btnRegister){

                // doStuff
                //Intent intentApp = new Intent(this,.class);
                //startActivity(intentApp);
            }
        }
    };*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
