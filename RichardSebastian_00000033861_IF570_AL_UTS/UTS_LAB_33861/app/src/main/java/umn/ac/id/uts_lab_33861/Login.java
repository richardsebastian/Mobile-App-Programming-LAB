package umn.ac.id.uts_lab_33861;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        if (getSupportActionBar()!= null){
            getSupportActionBar().hide();
        }

        EditText name = findViewById(R.id.editText);
        Button next = findViewById(R.id.nextbtt);
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(TextUtils.isEmpty(name.getText().toString())){
                    name.setError("Harap Di-isi");
                } else {
                    String str = name.getText().toString();
                    Intent library = new Intent(Login.this, Library.class);
                    library.putExtra("message_key", str);
                    startActivity(library);
                }

            }
        });


    }
}
