package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] name = {"Hamayun","Huzaifa","Zuhaib","Moeed"};
    private int[]  images ={R.drawable.jh,R.drawable.huzi,R.drawable.zuhaib,R.drawable.moeed};
    private List<persons> personsList = new ArrayList<>();
    private RecyclerView recyclerView;
    FloatingActionButton btnOpendialoge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvw);
        btnOpendialoge = findViewById(R.id.btnOpendialoge);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        preparetheList();

        RecyclerAdapter adapter = new RecyclerAdapter(personsList);
        recyclerView.setAdapter(adapter);

        btnOpendialoge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private void  preparetheList(){
        int count = 0;
        for (String name : name){
            persons person = new persons(name, images[count]);
            personsList.add(person);
            count ++;
        }
    }
}