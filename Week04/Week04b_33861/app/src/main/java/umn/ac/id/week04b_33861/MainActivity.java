package umn.ac.id.week04b_33861;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHal1, btnHal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHal1 = findViewById(R.id.main_button_change_1);
        btnHal2 = findViewById(R.id.main_button_change_2);

        btnHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent halaman1 = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(halaman1);
            }
        });
        btnHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent halaman2 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(halaman2);
            }
        });
    }
}