package com.example.moodtracker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.moodtracker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mood = binding.moodInput.getText().toString();

                if (mood.isEmpty()) {
                    binding.resultText.setText(R.string.enter_mood_prompt);
                } else {
                    binding.resultText.setText(getString(R.string.mood_result_text, mood));
                }
            }
        });
    }
}
