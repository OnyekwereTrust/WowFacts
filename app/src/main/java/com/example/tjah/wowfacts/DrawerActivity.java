package com.example.tjah.wowfacts;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.tjah.wowfacts.FragmentBook.Animal_Facts;
import com.example.tjah.wowfacts.FragmentBook.Food_Facts;
import com.example.tjah.wowfacts.FragmentBook.History_Facts;
import com.example.tjah.wowfacts.FragmentBook.Home;
import com.example.tjah.wowfacts.FragmentBook.People_Facts;
import com.example.tjah.wowfacts.FragmentBook.Places_Facts;
import com.example.tjah.wowfacts.FragmentBook.Technology_Facts;
import com.example.tjah.wowfacts.FragmentBook.Weird_Facts;

public class DrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        displaySelectedScreen(R.id.nav_home);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
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


    private void displaySelectedScreen(int id) {
        Fragment fragment = null;

        switch (id) {

            case R.id.nav_home:
            fragment = new Home();
                 break;
            case R.id.nav_technolgy:
                fragment = new Technology_Facts();
                break;
            case R.id.nav_people:
                fragment =new People_Facts();
                break;
            case R.id.nav_history:
                fragment =new History_Facts();
                break;
            case R.id.nav_animal:
                fragment = new Animal_Facts();
                break;
            case R.id.nav_places:
                fragment = new Places_Facts();
                break;
            case R.id.nav_weird:
                fragment =new Weird_Facts();
                break;
            case  R.id.nav_food:
                fragment = new Food_Facts();
                break;

        }

        if (fragment != null) {

            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.contentLayout, fragment);
            ft.commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
// Handle the drawer action

    displaySelectedScreen(id);

        return true;
    }
}
