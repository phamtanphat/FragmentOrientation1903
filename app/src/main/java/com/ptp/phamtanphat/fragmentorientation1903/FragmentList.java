package com.ptp.phamtanphat.fragmentorientation1903;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentList extends ListFragment {

    View view;
    ArrayList<String> mangten = new ArrayList<>();
    ArrayAdapter arrayAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list,container,false);

        mangten.add("Nguyen Van A");
        mangten.add("Nguyen Van B");
        mangten.add("Nguyen Van C");
        mangten.add("Nguyen Van D");
        mangten.add("Nguyen Van E");
        arrayAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,mangten);
        setListAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        super.onActivityCreated(savedInstanceState);
    }
}
