package com.example.hellojava;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setBackgroundColor(Color.parseColor("#1E1E2F"));

        TextView title = new TextView(this);
        title.setText("Hello, World!");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        final TextView counter = new TextView(this);
        counter.setText("Taps: 0");
        counter.setTextSize(22);
        counter.setTextColor(Color.LTGRAY);
        counter.setGravity(Gravity.CENTER);
        counter.setPadding(0, 40, 0, 40);

        Button button = new Button(this);
        button.setText("Tap me");
        button.setOnClickListener(v -> {
            count++;
            counter.setText("Taps: " + count);
        });

        root.addView(title);
        root.addView(counter);
        root.addView(button);

        setContentView(root);
    }
}
