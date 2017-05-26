package com.example.g40_70.agricularcom;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.g40_70.agricularcom.databinding.ActivityLogeateBinding;

public class LogeateActivity extends AppCompatActivity {

    ActivityLogeateBinding  binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_logeate);
        binding.setHandler(this);


    }
    public void goToNext(){
       // String usr =binding.usuario.getEditText().getText().toString();
        // String  pass =binding.pass.getEditText().getText().toString();

        Intent intent = new Intent(this, MenuAccesoDirectoActivity.class);
        startActivity(intent);
    }
}
