package com.example.achmadqomarudin.kidsdev.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.achmadqomarudin.kidsdev.R;

/**
 * Created by vanisia-chan on 10/11/2017.
 */

public class SettingActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Toolbar ToolBarAtas2 = (Toolbar)findViewById(R.id.toolbar_satu);
        setSupportActionBar(ToolBarAtas2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pilihan_setting();
//        TextView textView = new TextView(this);
//        textView.setText("Help Layout");
//        setContentView(textView);
    }

    public void pilihan_setting(){
        LinearLayout set_notif = (LinearLayout )findViewById(R.id.notif_layout);
        set_notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUpSetNotif();
            }
        });

        LinearLayout set_time = (LinearLayout )findViewById(R.id.time_layout);
        set_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(SettingActivity.this, "MUNCUL SETINGAN TIME INTERVAL", Toast.LENGTH_SHORT).show();
                popUpSetTime();
            }
        });

        LinearLayout set_app = (LinearLayout )findViewById(R.id.blocklist_layout);
        set_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "MUNCUL SETINGAN BLOCK APP", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void popUpSetNotif(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.set_notif);
        TextView cancel = (TextView) dialog.findViewById(R.id.cancel_set_notif);

        dialog.show();

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    private void popUpSetTime(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.set_time);
        TextView cancel = (TextView) dialog.findViewById(R.id.cancel_set_time);

        dialog.show();

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

    private void popUpSetApp(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.set_notif);
        TextView cancel = (TextView) dialog.findViewById(R.id.cancel_set_notif);

        dialog.show();

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
    }

}
