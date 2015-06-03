package com.example.android.makeful;

import android.support.v4.app.Fragment;
import android.os.Bundle;
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
    private EditText et;
    private ListView lv;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        projects = new ArrayList<String>();

        //button that, on click, will add user input to the listview
        //buttonAdd = (Button) rootView.findViewById(R.id.add_button_user_input);
        //*****buttonAdd.setOnClickListener();

        //edit text that will pass user input to the list
        et = (EditText) rootView.findViewById(R.id.edit_text_project_name);

        //creating array adapter to communicate with the listview
        userInputAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listitem_user_input, R.id.list_item_user_input_textview, projects);
        lv = (ListView) rootView.findViewById(R.id.list_item);
        lv.setAdapter(userInputAdapter);

        return rootView;
    }

    public void onClick(View v) {
        String input = et.getText().toString();
        if(input.length() > 0) {
            userInputAdapter.add(input);
        }
    }
}
