package com.ks.testone;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Spinner spinn;
CheckBox ch1,ch2,ch3;
RadioButton rb1,rb2;
Button b4,b2;
EditText ed1,ed2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);

        String[] arr = {"English","Nepali","Hindi","Punjabi"};
        spinn = findViewById(R.id.spinn);
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr);
        adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinn.setAdapter(adapt);



        //SUBMIT BUTTON
        b4 = (Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((ch1.isChecked()|| ch2.isChecked()|| ch3.isChecked()) && ((ed1.getText().toString().isEmpty())!=true)&&((ed1.getText().toString().isEmpty())!=true) && (rb1.isChecked()||rb2.isChecked())){
                    Toast.makeText(MainActivity.this, "Submitted the Record!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
