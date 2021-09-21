package com.example.intent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText value_text;
    Button button,button4;
    TextView show_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        value_text = (EditText) findViewById(R.id.value_text);
         button = (Button) findViewById(R.id.button);
         button4 = (Button)  findViewById(R.id.button4);
         show_text = (TextView) findViewById(R.id.show_text);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String value = value_text.getText().toString();

                 Intent intent = new Intent(MainActivity.this,SecondAcitvity.class);

                      intent.putExtra("f_value",value);

                      startActivityForResult(intent,1);



             }
         });

         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Intent intent3 = new Intent(MainActivity.this,ArrayIntent.class);
                 startActivity(intent3);
             }
         });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

                  if (requestCode ==1 && data != null)
                  {
                      String v = data.getStringExtra("sp_value");

                      show_text.setText(v);
                  }
    }
}