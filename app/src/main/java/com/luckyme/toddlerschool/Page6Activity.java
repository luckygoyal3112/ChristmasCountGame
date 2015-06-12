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
import android.widget.Toast;

/**
 * Created by lucky.goyal on 5/30/2015.
 */
public class Page6Activity extends Activity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page6);
        handlePage6();
        Button playbtn = (Button) findViewById(R.id.playbutton);
        playbtn.setOnClickListener(playagainlistener);

    }
    private void handlePage6(){
        Toast.makeText(Page6Activity.this, "Lets Party!", Toast.LENGTH_SHORT).show();
    }
    View.OnClickListener playagainlistener = new View.OnClickListener () {
        @Override
        public void onClick (View v) {
            Intent newgameIntent = new Intent(Page6Activity.this, MainActivityHome.class);
            startActivity(newgameIntent);
        }
    };
    View.OnClickListener exitlistener = new View.OnClickListener () {
        @Override
        public void onClick (View v) {
            finish();
            System.exit(0);
        }
    };
}
