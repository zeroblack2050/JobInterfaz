package com.example.jasmany.jobinterfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;



public class Principal extends AppCompatActivity {

    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        checkBox = (CheckBox)findViewById(R.id.checkboxOne);
    }

    public boolean isCheckboxSelected(boolean selected){
        return checkBox.isChecked();
    }

}
