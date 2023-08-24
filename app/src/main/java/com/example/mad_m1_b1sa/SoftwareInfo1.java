package com.example.mad_m1_b1sa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SoftwareInfo1 extends AppCompatActivity {
    TextView prod_desc;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_info1);

        prod_desc = findViewById(R.id.prod_desc);
        back = findViewById(R.id.backbtn);

        prod_desc.setText(R.string.prod1_desc);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(SoftwareInfo1.this,MainActivity.class);
                startActivity(main);
            }
        });
    }
}