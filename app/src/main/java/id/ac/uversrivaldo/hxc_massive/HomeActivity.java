package id.ac.uversrivaldo.hxc_massive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    Button btn1, btn2;
    ImageView img1, img2, img3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn1 = (Button) findViewById(R.id.btnGenerate);
        btn2 = (Button) findViewById(R.id.btnTemplate);

        img1 = (ImageView) findViewById(R.id.imgSettings);
        img2 = (ImageView) findViewById(R.id.Artikel1);
        img3 = (ImageView) findViewById(R.id.Artikel2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(HomeActivity.this, GenerateActivity.class);
                startActivity(next);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(HomeActivity.this, TemplateActivity.class);
                startActivity(next2);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next3 = new Intent(HomeActivity.this, PengaturanActivity.class);
                startActivity(next3);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artikel1 = new Intent(HomeActivity.this, ArtikelActivity.class);
                startActivity(artikel1);
            }
        });

    }
}