package com.chandanassign1_1;

/*
*   Name: Dan Chugani
*   Date: 09/23/2015
*   Description: This activity launches an activity with my name, a button to return to the first
*   activity, the date and an image.
*
*/

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Chandan2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandan2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chandan2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void activity1(View view) {
        Intent myIntent = new Intent(Chandan2Activity.this, ChandanActivity.class);
        Chandan2Activity.this.startActivity(myIntent);
    }
}
