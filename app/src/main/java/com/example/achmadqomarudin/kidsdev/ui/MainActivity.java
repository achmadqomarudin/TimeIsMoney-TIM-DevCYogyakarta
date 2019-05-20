package com.example.achmadqomarudin.kidsdev.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.achmadqomarudin.kidsdev.R;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Time Is Money");
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager();

        tabLayout.setupWithViewPager(viewPager);
        setUpTabsIcons();
    }

    private void setupViewPager() {
        AdapterViewPager viewPager = new AdapterViewPager(getSupportFragmentManager());
        viewPager.addFragment(new ToDoListFragment(), "TO DO LIST");
        viewPager.addFragment(new OnProgressFragment(), "ON PROGRESS");
        viewPager.addFragment(new DoneFragment(), "DONE");
//        viewPager.addFragment(new SettingFragment(), "SETTING");
        this.viewPager.setAdapter(viewPager);
    }

    private void setUpTabsIcons() {
//        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
//        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.opt_menu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.setting) {
            startActivity(new Intent(this, SettingActivity.class));
        }
//        else if (item.getItemId() == R.id.help) {
//            Toast.makeText(MainActivity.this, "Help Selected", Toast.LENGTH_SHORT).show();
//        }

        return true;
    }
}
