package id.ac.uversrivaldo.hxc_massive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PengaturanActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);

        txt1 = findViewById(R.id.InformasiProfile);
        txt2 = findViewById(R.id.TemplateSaya);
        txt3 = findViewById(R.id.Bahasa);
        txt4 = findViewById(R.id.TentangKami);


        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(PengaturanActivity.this, InformasiProfilActivity.class);
                startActivity(next);
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(PengaturanActivity.this, TemplateActivity.class);
                startActivity(next2);
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next4 = new Intent(PengaturanActivity.this, TentangKamiActivity.class);
                startActivity(next4);
            }
        });

    }
}