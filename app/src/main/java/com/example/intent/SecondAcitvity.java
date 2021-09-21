package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondAcitvity extends AppCompatActivity {

    EditText second_value;
    Button button2;
    TextView s_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acitvity);

         second_value = (EditText) findViewById(R.id.second_value);
         button2 = (Button) findViewById(R.id.button2);
         s_show = (TextView) findViewById(R.id.s_show);


         Intent intent = getIntent();

                    String vaa = intent.getStringExtra("f_value");

                    s_show.setText(vaa);

         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                 String s_value = second_value.getText().toString();

                 Intent intent2 = new Intent(SecondAcitvity.this,MainActivity.class);

                       intent2.putExtra("sp_value",s_value);

                       setResult(1,intent2);

                       finish();
             }
         });


    }


}