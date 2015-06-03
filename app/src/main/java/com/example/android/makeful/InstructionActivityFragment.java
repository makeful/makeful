package com.example.android.makeful;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        sampleDataStore = new Tree();
        instructionTree = sampleDataStore.getProject("Cupcakes");
        List<Instruction> instructions = TreeHelpers.flattenTree(instructionTree);
        instructionText = new ArrayList<String>();
        for(Instruction instr : instructions) {
            instructionText.add(instr.text);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_instruction, container, false);

        textAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listitem_user_input, R.id.list_item_user_input_textview, instructionText);


        ListView instructionList = (ListView)rootView.findViewById(R.id.instructionList);
        instructionList.setAdapter(textAdapter);

        return rootView;
    }
}
