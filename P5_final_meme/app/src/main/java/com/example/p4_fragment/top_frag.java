package com.example.p4_fragment;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.widget.Button;
import android.widget.EditText;

public class top_frag extends Fragment {

    private static EditText top_text;
    private static EditText bottom_text;

    toplisener activityCommander;
    public interface toplisener {
        public void create_meme(String top, String bottom);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            activityCommander = (toplisener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag, container, false);

        top_text = (EditText) view.findViewById(R.id.editText);
        bottom_text = (EditText) view.findViewById(R.id.editText2);
        final Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(
            new Button.OnClickListener() {
                @Override
                public void onClick(View v) {
                    buttonClicked(v);
                }

            }
        );

        return view;
    }

    public void buttonClicked(View v) {
        activityCommander.create_meme(top_text.getText().toString(), bottom_text.getText().toString());
    }

}
