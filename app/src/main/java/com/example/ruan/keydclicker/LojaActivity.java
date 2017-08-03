package com.example.ruan.keydclicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ruan on 31/07/17.
 */

public class LojaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);
    }

    public void Keyd_Upgrades(View v) {
        startActivity(new Intent(this, UpgradesActivity.class));
    }
}