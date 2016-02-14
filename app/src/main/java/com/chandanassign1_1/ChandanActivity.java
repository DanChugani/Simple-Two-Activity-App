package com.chandanassign1_1;
/*
*   Name: Dan Chugani
*   Date: 09/23/2015
*   Description: This activity launches an activity with my name, an image and two buttons
*   The first button starts a second activity and the second button launches a browser activity to
*   facebook.com
*
*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ChandanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandan);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chandan, menu);
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

    public void activity2(View view) {
        Intent myIntent = new Intent(ChandanActivity.this, Chandan2Activity.class);
        ChandanActivity.this.startActivity(myIntent);
    }

    public void launchBrowser(View view){
        String myURL = "http://www.facebook.com";
        Intent myIntent = new Intent(Intent.ACTION_VIEW);
        myIntent.setData(Uri.parse(myURL));
        startActivity(myIntent);
    }


}
