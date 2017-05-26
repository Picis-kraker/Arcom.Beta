package com.example.g40_70.agricularcom;


import android.databinding.DataBindingUtil;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.g40_70.agricularcom.adapters.ArcomAdapter;
import com.example.g40_70.agricularcom.databinding.ActivityMenuAccesoDirectoBinding;
import com.example.g40_70.agricularcom.util.Data;

public class MenuAccesoDirectoActivity extends AppCompatActivity implements ArcomAdapter.OnMovieSelected, DrawerLayout.DrawerListener, NavigationView.OnNavigationItemSelectedListener {

    ActivityMenuAccesoDirectoBinding binding;
    ArcomAdapter adapter;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_menu__acceso__directo_);

        adapter = new ArcomAdapter(getLayoutInflater(), Data.getData(), this);
        binding.list.setAdapter(adapter);
        binding.list.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle = new ActionBarDrawerToggle(this, binding.drawer, R.string.open, R.string.close);

        binding.drawer.addDrawerListener(this);
        binding.nav.setNavigationItemSelectedListener(this);
    }
    @Override
    public void onMovie(int position) {
        Toast.makeText(this, "Movie" + position, Toast.LENGTH_SHORT).show();
    }


    //region toogle
    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        toggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
                toggle.onDrawerSlide(drawerView,slideOffset);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        toggle.onDrawerOpened(drawerView);

    }

    @Override
    public void onDrawerClosed(View drawerView) {
     toggle.onDrawerClosed(drawerView);
    }

    @Override
    public void onDrawerStateChanged(int newState) {
      toggle.onDrawerStateChanged(newState);
    }


    //endregion

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        binding.drawer.closeDrawers();
        switch (item.getItemId()){
            case R.id.nav_portafolio:
                Toast.makeText(this, R.string.portafolio, Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_registro:
                Toast.makeText(this, R.string.registro,Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_eventos:
                Toast.makeText(this, R.string.eventos , Toast.LENGTH_SHORT).show();

            case R.id.nav_promociones:
                Toast.makeText(this, R.string.promociones , Toast.LENGTH_SHORT).show();

            case R.id.nav_escribeme:
                Toast.makeText (this, R.string.escribeme , Toast.LENGTH_SHORT).show();

        }

        return false;
    }
}
