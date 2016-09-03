package com.example.bobe.myappprofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.id_btn1)
    Button button1;
    @Bind(R.id.id_btn2)
    Button button2;
    @Bind(R.id.id_btn3)
    Button button3;
    @Bind(R.id.id_btn4)
    Button button4;
    @Bind(R.id.id_btn5)
    Button button5;
    @Bind(R.id.id_btn6)
    Button button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.id_btn1,
            R.id.id_btn2,
            R.id.id_btn3,
            R.id.id_btn4,
            R.id.id_btn5,
            R.id.id_btn6})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.id_btn1:
                Toast.makeText(MainActivity.this, "This button will launch my popular movies app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_btn2:
                Toast.makeText(MainActivity.this, "This button will launch my stock hawk app", Toast.LENGTH_SHORT).show();
                break;

            case R.id.id_btn3:
                Toast.makeText(MainActivity.this, "This button will launch my build it bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_btn4:
                Toast.makeText(MainActivity.this, "This button will launch my make your app material app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_btn5:
                Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.id_btn6:
                Toast.makeText(MainActivity.this, "This button will launch my capstone app", Toast.LENGTH_SHORT).show();
                break;




        }
    }
}
