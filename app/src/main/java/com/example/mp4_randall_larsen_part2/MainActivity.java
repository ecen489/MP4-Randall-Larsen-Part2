package com.example.mp4_randall_larsen_part2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button divide_button;
    Button multiply_button;
    Button substract_button;
    Button add_button;

    EditText num1_edit;
    EditText num2_edit;

    TextView result_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        divide_button = findViewById(R.id.button_divide);
        multiply_button = findViewById(R.id.button_multiply);
        substract_button = findViewById(R.id.button_subtract);
        add_button =   findViewById(R.id.button_add);

        num1_edit = findViewById(R.id.editText_num1);
        num2_edit = findViewById(R.id.editText_num2);

        result_view = findViewById(R.id.textView_result);

    }

    public void divide_click(View view) {
        float num1_input = Float.parseFloat(num1_edit.getText().toString());
        float num2_input = Float.parseFloat(num2_edit.getText().toString());
        float num_result;

        num_result = num2_input / num1_input;

        result_view.setText(String.valueOf(num_result));
    }

    public void multiply_click(View view) {
        float num1_input = Float.parseFloat(num1_edit.getText().toString());
        float num2_input = Float.parseFloat(num2_edit.getText().toString());
        float num_result;
        num_result = num1_input * num2_input;

        result_view.setText(String.valueOf(num_result));
    }

    public void subtract_click(View view) {
        float num1_input = Float.parseFloat(num1_edit.getText().toString());
        float num2_input = Float.parseFloat(num2_edit.getText().toString());
        float num_result;

        num_result = num2_input - num1_input;

        result_view.setText(String.valueOf(num_result));
    }

    public void add_click(View view) {
        float num1_input = Float.parseFloat(num1_edit.getText().toString());
        float num2_input = Float.parseFloat(num2_edit.getText().toString());
        float num_result;

        num_result = num1_input + num2_input;

        result_view.setText(String.valueOf(num_result));
    }

    public void equals_click(View view) {
    }
}
