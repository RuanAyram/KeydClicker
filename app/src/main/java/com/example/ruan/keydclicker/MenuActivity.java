package com.example.ruan.keydclicker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ruan on 31/07/17.
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Keyd_Main(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void Sair(View v) {
        finish();
    }

    // Dialog do botão info
    public void onClickInfo(View v) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setMessage("Feito por um fã do maior time de e-sports do Brasil. #KeydDeVerdade");
        dialog.setNeutralButton("OK", null);
        dialog.setTitle("INFO");
        dialog.setIcon(R.drawable.ic_imgclick);
        dialog.show();
    }
}