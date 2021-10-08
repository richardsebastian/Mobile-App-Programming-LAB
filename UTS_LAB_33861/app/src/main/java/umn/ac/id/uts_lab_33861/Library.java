package umn.ac.id.uts_lab_33861;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    ArrayList<Audio> list = new ArrayList<>();
    RecyclerView recyclerView;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        if(getSupportActionBar() != null) {
            Intent intent = getIntent();
            String str = intent.getStringExtra("message_key");
            setTitle(str);
            Toast.makeText(getApplicationContext(), "Selamat Datang, " + str, Toast.LENGTH_SHORT).show();
        }
        daftarSFX();
        recyclerView = findViewById(R.id.recyclerView);
        adapter = new ListAdapter(this,list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.mainactv){
            Intent mainactv = new Intent(Library.this, MainActivity.class);
            startActivity(mainactv);
        } else {
            Intent prf = new Intent(Library.this, Profile.class);
            startActivity(prf);
        }
        return super.onOptionsItemSelected(item);
    }
    public void daftarSFX(){
        list.add(new Audio("Thunder Birds","Suara Petir", "android.resource://" + getPackageName() + "/"+ R.raw.thunderbirds));
        list.add(new Audio("Halloween Theme","Ringtone Spooky", "android.resource://" + getPackageName() + "/"+ R.raw.halloween_theme));
        list.add(new Audio("Scooby Doo Sound","Ringtone Suara Scooby Doo", "android.resource://" + getPackageName() + "/"+ R.raw.scooby_doo));
        list.add(new Audio("Old Telephone Ring Sound","Suara Telepon Jadul", "android.resource://" + getPackageName() + "/"+ R.raw.old_telephone));
        list.add(new Audio("Uptown Funk Reff","Lagu Uptown Funk Bagian Reff", "android.resource://" + getPackageName() + "/"+ R.raw.uptown_funk));
    }
}