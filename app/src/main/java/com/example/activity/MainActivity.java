package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // אתחול רכיבי ה-UI
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

        // לחיצה על הכפתור לפתיחת האקטיביטי MainActivity2
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // קבלת הטקסט מה-EditText
                String userInput = editText.getText().toString();

                // יצירת Intent עבור MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("USER_INPUT", userInput); // שליחת הנתון לאקטיביטי השנייה

                // פתיחת MainActivity2
                startActivity(intent);

                // סגירת MainActivity
                finish();
            }
        });
    }
}
