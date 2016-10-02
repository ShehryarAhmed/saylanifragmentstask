package com.example.sayla.secondprojectfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.buttoon1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,"button1",Toast.LENGTH_SHORT).show();
              getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Fragment1()).commit();
            }
        });
        Button button2 = (Button) findViewById(R.id.buttoon2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,"button2",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Fragment2()).commit();
            }
        });  Button button3 = (Button) findViewById(R.id.buttoon3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Toast.makeText(MainActivity.this,"button3",Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout,new Fragment3()).commit();
            }
        });
    }
}
