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

import com.example.android.makeful.tree.Tree;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayList<String> projects;
    private ArrayAdapter<String> userInputAdapter;
    private Button buttonAdd;
    private Button listProjects;
    private Button newProject;

    private EditText et;
    private ListView lv;


    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        listProjects = (Button)rootView.findViewById(R.id.listProjects);
        listProjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ProjectListActivity.class);
                startActivity(intent);
            }
        });

        newProject = (Button)rootView.findViewById(R.id.newProject);
        newProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String projectName = "My cool project";
                Tree.getInstance().newProject(projectName);

                Intent intent = new Intent(getActivity(), InstructionActivity.class);
                Bundle b = new Bundle();
                b.putString("projectName", projectName);
                intent.putExtras(b);
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
