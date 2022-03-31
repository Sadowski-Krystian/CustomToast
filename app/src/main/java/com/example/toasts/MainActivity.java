package com.example.toasts;

import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    Button btn_label, btn_toast, btn_custom, btn_snack;
    TextView lbl_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_label = findViewById(R.id.btn_label);
        btn_toast = findViewById(R.id.btn_toast);
        btn_custom = findViewById(R.id.btn_custom);
        btn_snack = findViewById(R.id.btn_snack);
        lbl_info = findViewById(R.id.lbl_error);

        btn_label.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lbl_info.getVisibility() == view.INVISIBLE){
                    lbl_info.setVisibility(view.VISIBLE);
                    lbl_info.setText("Jestem Errorem");
                    lbl_info.setBackgroundColor(Color.RED);
                }else{
                    lbl_info.setVisibility(view.INVISIBLE);
                }



            }
        });
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "To jest zwykły toast", Toast.LENGTH_SHORT).show();
            }
        });
        btn_snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(findViewById(R.id.main), "To jest snack bar", Snackbar.LENGTH_SHORT)
                        .show();
            }
        });
    }
}