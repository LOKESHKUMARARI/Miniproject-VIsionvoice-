package com.example.visionvoice;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer buttonSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize sound effect
        buttonSound = MediaPlayer.create(this, R.raw.click_sound);

        // Find the buttons in the layout
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        // Set onClickListener for button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(); // Play sound on click
                Intent intent = new Intent(MainActivity.this, WebViewActivity1.class);
                startActivity(intent); // Open WebViewActivity1
            }
        });

        // Set onClickListener for button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(); // Play sound on click
                Intent intent = new Intent(MainActivity.this, WebViewActivity2.class);
                startActivity(intent); // Open WebViewActivity2
            }
        });
    }

    // Play sound when button is clicked
    private void playSound() {
        if (buttonSound != null) {
            buttonSound.start();
        }
    }

    // Release the MediaPlayer when the activity is destroyed
    @Override
    protected void onDestroy() {
        if (buttonSound != null) {
            buttonSound.release();
            buttonSound = null;
        }
        super.onDestroy();
    }
}
