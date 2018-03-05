package com.example.orol.test1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    CheckBox checkBox;
    RadioGroup radioGroup;
    Button bt_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ㅂㅇㄹ!");

        imageView = (ImageView) findViewById(R.id.image);
        checkBox = (CheckBox) findViewById(R.id.checkbox);
        radioGroup = (RadioGroup) findViewById(R.id.rGroup);
        bt_submit = (Button) findViewById(R.id.bt_submit);

        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v){
                if (checkBox.isChecked()) {
                    checkBox.setText("is Checked");
                    Toast.makeText(getApplicationContext(), "체크됨", Toast.LENGTH_SHORT).show();
                } else {
                    checkBox.setText("is not Checked");
                    Toast.makeText(getApplicationContext(), "체크해제됨", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt_submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                switch (id) {
                    case R.id.yellowF:
                        id = R.drawable.sample1;
                        break;
                    case R.id.whiteF:
                        id = R.drawable.sample2;
                        break;
                    case R.id.redF:
                        id = R.drawable.sample3;
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "색상을 먼저 선택해주세요", Toast.LENGTH_SHORT).show();
                        return;
                }
                imageView.setImageResource(id);
            }
        });
    }
}