package com.pointpark.myfirstapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView txtView1;
    private EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstlayout);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        txtView1 = (TextView) findViewById(R.id.txtView1);
        txtName = (EditText) findViewById(R.id.txtName);

        btnSubmit.setText(R.string.Button_name);
        btnSubmit.setTextColor(Color.RED);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
              public void onClick(View v){
                String InputText;
                InputText = txtName.getText().toString();
                txtView1.setVisibility(View.VISIBLE);
                txtView1.setText(InputText);
            }

        });
    }



/*
    public void ShowMeText(View view){
        txtView1.setVisibility(View.VISIBLE);
        txtView1.setText(R.string.show_text);
    }
    */
}
