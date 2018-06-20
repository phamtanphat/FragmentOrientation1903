package com.ptp.phamtanphat.fragmentorientation1903;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentChitiet extends Fragment {

    View view;
    TextView txtChitiet;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_chitiet,container,false);
        txtChitiet = view.findViewById(R.id.textviewChitiet);
        return view;
    }

}
