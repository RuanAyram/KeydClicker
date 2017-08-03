package com.example.ruan.keydclicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int numClicks = 0;
    int coin = 0;
    int numCTotal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateText();
    }

    // Update numClicks | coin/sec | CTotal
    private void updateText() {
        String s = getString(R.string.Text_View) + " " + numClicks;
        TextView tv = (TextView) findViewById(R.id.textView_Main_Clicks);
        tv.setText(s);

        String s1 = getString(R.string.Text_View1) + " " + coin;
        TextView tv1 = (TextView) findViewById(R.id.textView_Main_Clicks_Sec);
        tv1.setText(s1);

        String s2 = getString(R.string.Text_View2) + " " + numCTotal;
        TextView tv2 = (TextView) findViewById(R.id.textView_Main_Clicks_Total);
        tv2.setText(s2);
    }

    // Contador de clicks/coins
    public void processAll(View v) {
        processClick(v);
        processCoin(v);
        processClickTotal(v);
    }

    // Contador de clicks
    public void processClick(View v) {
        numClicks++;
        updateText();
    }

    // Contador de coins
    public void processCoin(View v) {
        updateText();
    }

    // Contador de clicksTotais
    public void processClickTotal(View v) {
        numCTotal++;
        updateText();
    }

    // Acao dos botoes
    public void Keyd_Menu(View v) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    // Acao dos botoes
    public void Keyd_Loja(View v) {
        startActivity(new Intent(this, LojaActivity.class));
    }

    // Acao dos botoes
    public void Keyd_Upgrades(View v) { startActivity(new Intent(this, UpgradesActivity.class)); }
}
