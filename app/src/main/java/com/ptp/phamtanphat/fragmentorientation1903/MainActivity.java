package com.ptp.phamtanphat.fragmentorientation1903;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Nhandulieu{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void ReciveData(String chuoi) {
        FragmentChitiet fragmentChitiet = (FragmentChitiet) getFragmentManager().findFragmentById(R.id.fragmentChitietLandscape);
//        getResources().getConfiguration().orientation
        if (fragmentChitiet != null && fragmentChitiet.isInLayout()){
            fragmentChitiet.txtChitiet.setText(chuoi);
        }else{
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("value",chuoi);
            startActivity(intent);
        }
    }
}
