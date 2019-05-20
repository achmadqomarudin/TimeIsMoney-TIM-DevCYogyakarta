package com.example.achmadqomarudin.kidsdev.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.achmadqomarudin.kidsdev.R;

public class DoneFragment extends Fragment implements View.OnClickListener {

    private LinearLayout rv,list_done;
    public DoneFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_done, container, false);

        rv = view.findViewById(R.id.lv_review);
        list_done = view.findViewById(R.id.listDone);
        initt();
        return view;
    }

    public void initt() {
        rv.setOnClickListener(this);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.lv_review:
                tampilListDone();
                break;
        }
    }

    void tampilListDone(){
        list_done.setVisibility(View.VISIBLE);
    }
}
