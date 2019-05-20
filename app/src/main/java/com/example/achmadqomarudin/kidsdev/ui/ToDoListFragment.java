package com.example.achmadqomarudin.kidsdev.ui;


import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.achmadqomarudin.kidsdev.R;

public class ToDoListFragment extends Fragment {

    Dialog dialog;
    FloatingActionButton btn;

    public ToDoListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_to_do_list, container, false);

        btn = view.findViewById(R.id.add_button);
        btn.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.white)));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogTambah();
            }
        });

        return view;
    }

    private void dialogTambah() {
        dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_tambah);
        dialog.setCanceledOnTouchOutside(false);
        Button mExitDialog = dialog.findViewById(R.id.exit_dialog);
        Button mBotolSetor = dialog.findViewById(R.id.cBotolSetor);
        mBotolSetor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "add data success", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });
        mExitDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        dialog.getWindow().setLayout((6 * width) / 7, LinearLayout.LayoutParams.WRAP_CONTENT);
        dialog.show();
    }
}
