package com.carlos.a21632699.mrfox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyMain extends AppCompatActivity {
    Toolbar toolbar;
    private CircleImageView circleImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);
        getActionBar().hide();

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        circleImageView = (CircleImageView) findViewById(R.id.zorro);

    }
}
