package com.example.mferraco.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @SuppressWarnings("unused")
    public void projectButtonClick(View view) {
        Button btn = (Button) view;
        Toast.makeText(getApplicationContext(), getString(R.string.toast_message) + btn.getText(), Toast.LENGTH_SHORT).show();
    }

}
