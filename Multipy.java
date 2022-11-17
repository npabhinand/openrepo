package com.example.labinternal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class Multiply extends AppCompatActivity {
    TextView result;
    private TextView mTextViewFirstName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);

        Intent i = getIntent();

        String FirstName = i.getStringExtra("Firstname");


        mTextViewFirstName = findViewById(R.id.GetFirstName);
        result =findViewById(R.id.res);

        mTextViewFirstName.setText(FirstName);
        int n = Integer.parseInt(FirstName);
        StringBuffer buffer = new StringBuffer();
        // build the logic for table
        for ( int j = 1; j <= 10; j++) {
            int ans = (j * n);

            buffer.append(n + " X " + j
                    + " = " + ans + "\n\n");

        }
        result.setText(buffer);

    }
}


