package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntent extends AppCompatActivity {

    EditText name,code;
    Button button3;

    RecyclerView rec;

    Adapter adapter;
    List<Model> namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_intent);


        namelist = new ArrayList<Model>();


        name = (EditText) findViewById(R.id.name);
        code = (EditText) findViewById(R.id.code);

        button3 = (Button) findViewById(R.id.button3);

        rec = (RecyclerView) findViewById(R.id.rec);

        rec.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(ArrayIntent.this,namelist);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String value_name = name.getText().toString();
                int value_code = Integer.parseInt(code.getText().toString());

                 namelist.add(new Model(value_name,value_code));

                 preparelist();

                  rec.setAdapter(adapter);
            }
        });

    }

    void preparelist()
    {
        adapter.notifyDataSetChanged();
    }
}