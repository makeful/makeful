package com.makefulapp.android.makeful;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.makefulapp.android.makeful.tree.Tree;

import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class ProjectListActivityFragment extends Fragment {

    ArrayAdapter<String> textAdapter;
    Tree sampleDataStore;
    List<String> projectNames;

    public ProjectListActivityFragment() {
        sampleDataStore = Tree.getInstance();
        projectNames = sampleDataStore.getProjectNames();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_project_list, container, false);

        textAdapter = new ArrayAdapter<String>(getActivity(), R.layout.instruction_list_row, R.id.list_item_user_input_textview, projectNames);

        ListView projectList = (ListView)rootView.findViewById(R.id.projectList);
        projectList.setAdapter(textAdapter);
        projectList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String projectName = projectNames.get(position);

                Intent intent = new Intent(getActivity(), InstructionActivity.class);
                Bundle b = new Bundle();
                b.putString("projectName", projectName);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
