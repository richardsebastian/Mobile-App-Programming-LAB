package umn.ac.id.uts_lab_33861;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button prfbtt,lbrbtt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar()!= null){
            getSupportActionBar().hide();
        }

        prfbtt = findViewById(R.id.prfbtt);
        lbrbtt = findViewById(R.id.lbrbtt);

        prfbtt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent prf = new Intent(MainActivity.this, Profile.class);
                startActivity(prf);
            }
        });

        lbrbtt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent login = new Intent(MainActivity.this, Login.class);
                startActivity(login);
            }
        });


    }
}