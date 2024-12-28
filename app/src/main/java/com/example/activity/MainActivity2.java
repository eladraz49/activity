package com.example.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // אתחול רכיבי ה-UI
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        // קבלת הטקסט שנשלח ב-Intent
        String userInput = getIntent().getStringExtra("USER_INPUT");

        // הצגת הטקסט ב-TextView
        textView.setText(userInput);

        // לחיצה על הכפתור לסגור את MainActivity2
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // סוגר את האקטיבי
            }
        });
    }
}

