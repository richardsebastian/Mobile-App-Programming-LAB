package umn.ac.id.uts_lab_33861;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailAudio extends AppCompatActivity {

    public static final String EXTRA_TITLE ="title";
    public static final String EXTRA_DESC = "desc";
    public static final String EXTRA_URI = "uri";
    TextView ttlv, dscv;
    Button plybtt;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String title = getIntent().getStringExtra(EXTRA_TITLE);
        String desc = getIntent().getStringExtra(EXTRA_DESC);
        String uri = getIntent().getStringExtra(EXTRA_URI);
        setContentView(R.layout.detail);
        ttlv = findViewById(R.id.dtlttl);
        dscv = findViewById(R.id.dtldesc);
        plybtt = findViewById(R.id.plybtt);
        ttlv.setText(title);
        dscv.setText(desc);
        getSupportActionBar().setTitle(title);

        mp = MediaPlayer.create(getApplicationContext(), Uri.parse(uri));
        plybtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        mp.stop();
        mp.release();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
