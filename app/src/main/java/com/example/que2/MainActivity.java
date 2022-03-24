package com.example.que2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    TextView tv;
    Button btn;
    int counter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=findViewById(R.id.et);
        tv=findViewById(R.id.tv);
        btn=findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a=et.getText().toString();
                if(a.isEmpty())
                {
                   et.setError("Please Enter name");
                   et.requestFocus();
                }
                else
                {
                    tv.setText("Hello, \n"+a);
                    Toast.makeText(MainActivity.this, ""+counter, Toast.LENGTH_SHORT).show();
                    counter++;
                    et.setText("");
                }



            }
        });
    }
}