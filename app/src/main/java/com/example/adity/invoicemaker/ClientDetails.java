package com.example.adity.invoicemaker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ClientDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_details);

        getSupportActionBar().hide();
    }
}