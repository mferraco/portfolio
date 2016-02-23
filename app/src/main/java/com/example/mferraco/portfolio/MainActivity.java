package com.example.mferraco.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout buttonLayout = (LinearLayout) findViewById(R.id.linear_button_layout);

        // Loop through every button and add the on click listener
        for(int i = 0; i < buttonLayout.getChildCount(); ++i) {
            final View childView = buttonLayout.getChildAt(i);

            if (childView instanceof Button) {
                childView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) childView).getText(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }

    }

}
