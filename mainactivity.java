package com.example.labinternal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText mEditTextFirstName;

    private Button mSendBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextFirstName = findViewById(R.id.editTextFirstName);




        mSendBtn = findViewById(R.id.Send);

        mSendBtn.setOnClickListener(v -> {

            String getFirstName = mEditTextFirstName.getText().toString();




                Intent i = new Intent(MainActivity.this, Multiply.class);
                i.putExtra("Firstname", getFirstName);
                startActivity(i);

        });
    }
}
