package com.example.keyboardtask;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.keyboardtask.databinding.ActivityAlertBinding;

public class ActivityAlert extends AppCompatActivity {
    private ActivityAlertBinding binding;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        binding.button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                builder.setMessage("Click OK to GO to clock");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getApplicationContext(),Clock.class);
                        startActivity(intent);
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });


    }
}