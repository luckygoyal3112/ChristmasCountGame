package com.luckyme.toddlerschool;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by lucky.goyal on 5/30/2015.
 */
public class Page5Activity extends Activity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page5);
        handlePage5();
    }
    private void handlePage5(){
        ImageButton button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(wrongClickListener);
        ImageButton button2 = (ImageButton) findViewById(R.id.button2);
        button2.setOnClickListener(wrongClickListener);
        ImageButton button3 = (ImageButton) findViewById(R.id.button3);
        button3.setOnClickListener(wrongClickListener);
        ImageButton button4 = (ImageButton) findViewById(R.id.button4);
        button4.setOnClickListener(wrongClickListener);
        ImageButton button5 = (ImageButton) findViewById(R.id.button5);
        button5.setOnClickListener(rightClickListener);
    }

    View.OnClickListener wrongClickListener = new View.OnClickListener() {
        public void onClick (View v){
            //call wrong TOAST
            Toast.makeText(Page5Activity.this, "Try Again. Sorry!", Toast.LENGTH_SHORT).show();

        }
    };
    View.OnClickListener rightClickListener = new View.OnClickListener() {
        public void onClick (View v){
            Toast.makeText(Page5Activity.this,"Well done. Game Over", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Page5Activity.this, Page6Activity.class);
            startActivity(intent);
        }
    };
}
