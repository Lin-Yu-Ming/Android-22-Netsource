package com.example.android_num_22_internetsource;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void wifi_or_data(View v){
        ConnectivityManager connectivityManager =
                (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo Net = connectivityManager.getActiveNetworkInfo();

        if (Net != null){
            //WIFI
            if (Net.getType() == ConnectivityManager.TYPE_WIFI) {
                Toast.makeText(this, "WIFI", Toast.LENGTH_SHORT).show();
            }
            //行動數據
            else if (Net.getType() == ConnectivityManager.TYPE_MOBILE){
                Toast.makeText(this, "基地台", Toast.LENGTH_SHORT).show();
            }
        }
        else
            Toast.makeText(this, "未連接WIFI or 數據", Toast.LENGTH_SHORT).show();
    }
}