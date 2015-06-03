package com.example.android.makeful;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayList<String> projects;
    private ArrayAdapter<String> userInputAdapter;
    private Button buttonAdd;
    private Button makeCupcakes;

    private EditText et;
    private ListView lv;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        makeCupcakes = (Button)rootView.findViewById(R.id.makeCupcakes);
        makeCupcakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), InstructionActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }

    public void onClick(View v) {
        String input = et.getText().toString();
        if(input.length() > 0) {
            userInputAdapter.add(input);
        }
    }
}
