package umn.ac.id.uts_lab_33861;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private TextView link1,link2,link3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        TextView link1 = findViewById(R.id.link1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link2 = findViewById(R.id.link2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView link3 = findViewById(R.id.link3);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
