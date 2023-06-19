package namnguyen.tdmu.mymoney.activity;

import android.app.TabActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.Toast;

import namnguyen.tdmu.mymoney.R;


public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TabHost tabHost = getTabHost();

        TabHost.TabSpec thuchi = tabHost.newTabSpec("Thu Chi");
        thuchi.setIndicator("Thu Chi", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent i = new Intent(MainActivity.this, ThuChiMainActivity.class);
        thuchi.setContent(i);

        TabHost.TabSpec thongke = tabHost.newTabSpec("Thống Kê");

        thongke.setIndicator("Thống Kê", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent o = new Intent(this, StatsActivity.class);
        thongke.setContent(o);

        TabHost.TabSpec caidat = tabHost.newTabSpec("Cài Đặt");
        caidat.setIndicator("Cài Đặt", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent p = new Intent(this, CaiDatActivity.class);
        caidat.setContent(p);
        tabHost.addTab(thuchi);
        tabHost.addTab(thongke);
        tabHost.addTab(caidat);

        tabHost.setCurrentTab(0);

    }

}

