package com.example.drawerlayout;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout nDrawerlayout;
    private ActionBarDrawerToggle nToogle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    nDrawerlayout =(DrawerLayout)findViewById(R.id.drawer);
    nToogle=new ActionBarDrawerToggle(this,nDrawerlayout,R.string.open,R.string.close);
    nDrawerlayout.addDrawerListener(nToogle);
    nToogle.syncState();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(nToogle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
