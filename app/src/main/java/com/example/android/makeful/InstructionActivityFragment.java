package com.example.android.makeful;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.makeful.tree.Instruction;
import com.example.android.makeful.tree.Node;
import com.example.android.makeful.tree.Tree;
import com.example.android.makeful.tree.TreeHelpers;

import java.util.ArrayList;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class InstructionActivityFragment extends Fragment {

    ArrayAdapter<String> textAdapter;
    Tree sampleDataStore;
    Node instructionTree;
    List<String> instructionText;

    public InstructionActivityFragment() {
        sampleDataStore = Tree.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println(getArguments());
        String projectName = getArguments().getString("projectName");

        instructionTree = sampleDataStore.getProject(projectName);

        List<Instruction> instructions = TreeHelpers.flattenTree(instructionTree);
        instructionText = new ArrayList<String>();
        for(Instruction instr : instructions) {
            instructionText.add(instr.text);
        }

        View rootView = inflater.inflate(R.layout.fragment_instruction, container, false);

        textAdapter = new ArrayAdapter<String>(getActivity(), R.layout.instruction_list_row, R.id.list_item_user_input_textview, instructionText);

        ListView instructionList = (ListView)rootView.findViewById(R.id.instructionList);
        instructionList.setAdapter(textAdapter);

        return rootView;
    }
}
