package com.example.android.makeful;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ashley on 6/2/15.
 */
public class InstructionDisplayFragment extends Fragment{
        private ArrayAdapter<String> instruction_adapter;

        public InstructionDisplayFragment() {
        }
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //Add this line in order for this fragment to handle menu events.
            setHasOptionsMenu(true);
        }


        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
            inflater.inflate(R.menu.menu_main, menu);
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){
            //Handle action bar item clicks here. The action bar will
            //automatically handle clicks on the Home/Up button, so long
            //as you specify a parent activity in AndroidManifest.xml

            int id = item.getItemId();
            if(id == R.id.action_refresh) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            ArrayList<String> weatherData = new ArrayList<String>();
            weatherData.add("Today - Sunny - 88 / 63");
            weatherData.add("Tomorrow - Sunny - 88 / 63");
            weatherData.add("Monday - Sunny - 88 / 63");
            weatherData.add("Tuesday - Sunny - 88 / 63");
            weatherData.add("Wednesday - Sunny - 88 / 63");
            weatherData.add("Thursday - Sunny - 88 / 63");
            weatherData.add("Friday- Sunny - 88 / 63");
            weatherData.add("Saturday - Sunny - 88 / 63");
            weatherData.add("Sunday - Sunny - 88 / 63");

            instruction_adapter = new ArrayAdapter<String>(
                    //The current context (fragment's parent activity)
                    getActivity(),
                    //ID of the list item layout
                    R.layout.list_item_instructions,
                    //links to the specific textView
                    R.id.list_item_instruction_textview,
                    //reference to our forecast data
                    weatherData);

            ListView listView = (ListView) rootView.findViewById(R.id.list_item_instruction_textview);
            listView.setAdapter(instruction_adapter);

            return rootView;
        }

}