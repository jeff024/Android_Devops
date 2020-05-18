package com.example.p4_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.TextView;


public class bot_frag extends Fragment {


    private static TextView top_text;
    private static TextView bottom_text;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_frag, container, false);
        top_text = (TextView) view.findViewById(R.id.textView2);
        bottom_text = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void setmeme(String top, String bottom) {
        top_text.setText((top));
        bottom_text.setText(bottom);
    }
}
