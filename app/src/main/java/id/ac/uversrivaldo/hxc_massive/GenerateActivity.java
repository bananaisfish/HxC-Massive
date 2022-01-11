package id.ac.uversrivaldo.hxc_massive;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class GenerateActivity extends AppCompatActivity {

    Dialog myDialog;

    TextInputLayout textInputLayout, textInputLayout2;
    AutoCompleteTextView autoCompleteTextView, autoCompleteTextView2;

    EditText editText1, editText2, editText3;
    Button btnClear, btnGenerate;
    ImageView img1, img2, img3, img4, img5, img6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);

        myDialog = new Dialog(this);

        textInputLayout = findViewById(R.id.menu_drop);
        textInputLayout2 = findViewById(R.id.menu_drop2);
        autoCompleteTextView = findViewById(R.id.drop_items);
        autoCompleteTextView2 = findViewById(R.id.drop_items2);


        String[] items = {"Bapak", "Ibu"};
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(GenerateActivity.this, R.layout.dropdown_item, items);
        autoCompleteTextView.setAdapter(itemAdapter);

        String[] items2 = {"Assalamu’alaikum", "Selamat Pagi", "Selamat Siang", "Selamat Malam"};
        ArrayAdapter<String> itemAdapter2 = new ArrayAdapter<>(GenerateActivity.this, R.layout.dropdown_item, items2);
        autoCompleteTextView2.setAdapter(itemAdapter2);


        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);

        btnClear = findViewById(R.id.btnClear);
        btnGenerate = findViewById(R.id.btnGenerate);




        img1 = findViewById(R.id.tujuan1);
        img2 = findViewById(R.id.tujuan2);
        img3 = findViewById(R.id.tujuan3);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("Saya ingin bertanya");
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("Saya ingin mengajukan izin");
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("Saya ingin asesmen");
            }
        });


        img4 = findViewById(R.id.terimakasih1);
        img5 = findViewById(R.id.terimakasih2);
        img6 = findViewById(R.id.terimakasih3);

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText3.setText("Atas waktu dan perhatian ..., saya ucapkan terimakasih.");
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText3.setText("Terimakasih atas waktunya .... Terimakasih");
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText3.setText("Sebelumnya terimakasih banyak ....");
            }
        });


    }

    public void ShowPopUp(View v) {
        ImageView btnClose;
        TextView txtView;
        Button btnShare;




        String editext1Key = editText1.getText().toString();
        String editext2Key = editText2.getText().toString();
        String editext3Key = editText3.getText().toString();

        if (editext1Key.trim().equals("")) {
            editText1.setError("Tidak boleh kosong");
        } else if (editext2Key.trim().equals("")) {
            editText2.setError("Tidak boleh kosong");
        } else if(editext3Key.trim().equals("")){
            editText3.setError("Tidak boleh kosong");
        } else {
            myDialog.setContentView(R.layout.custome_popup);
            txtView = (TextView) myDialog.findViewById(R.id.hslGenerate);
            txtView.setText(autoCompleteTextView2.getText() + " " + autoCompleteTextView.getText() + "\n \n" + editText1.getText() + ", " + editText2.getText() + "\n \n" + editText3.getText());



            btnClose = (ImageView) myDialog.findViewById(R.id.btnClose);
            btnShare = (Button) myDialog.findViewById(R.id.btnShare);

            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent shareintent = new Intent();
                    shareintent.setAction(Intent.ACTION_SEND);
                    shareintent.putExtra(Intent.EXTRA_TEXT, txtView.getText());
                    shareintent.setType("text/plain");
                    startActivity(shareintent);

                }
            });


            btnClose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myDialog.dismiss();
                }
            });

            myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialog.show();
        }
    }
}

