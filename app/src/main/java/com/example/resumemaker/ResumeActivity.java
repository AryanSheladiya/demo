package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class ResumeActivity extends AppCompatActivity {

    ImageButton img_btn_activity_1,img_btn_activity_2,img_btn_activity_3,img_btn_activity_4,img_btn_activity_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        Intentcview();
    }
    void Intentcview()
    {
        img_btn_activity_1=findViewById(R.id.img_btn_activity_1);
        img_btn_activity_2=findViewById(R.id.img_btn_activity_2);
        img_btn_activity_3=findViewById(R.id.img_btn_activity_3);
        img_btn_activity_4=findViewById(R.id.img_btn_activity_4);
        img_btn_activity_5=findViewById(R.id.img_btn_activity_5);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String number = intent.getStringExtra("number");
        String mail = intent.getStringExtra("mail");
        String address = intent.getStringExtra("address");
        String dob = intent.getStringExtra("dob");
        String hobbies = intent.getStringExtra("hobbies");
        String skill = intent.getStringExtra("skill");
        String caste = intent.getStringExtra("caste");
        String degree = intent.getStringExtra("degree");
        String callage = intent.getStringExtra("callage");
        String percentage = intent.getStringExtra("percentage");
        String year = intent.getStringExtra("year");
        String occupation = intent.getStringExtra("occupation");
        String company = intent.getStringExtra("company");
        String year_1 = intent.getStringExtra("year_1");

        img_btn_activity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent First = new Intent(ResumeActivity.this,InputActivity.class);

                First.putExtra("name",name);
                First.putExtra("number",number);
                First.putExtra("mail",mail);
                First.putExtra("address",address);
                First.putExtra("dob",dob);
                First.putExtra("hobbies",hobbies);
                First.putExtra("skill",skill);
                First.putExtra("caste",caste);
                First.putExtra("degree",degree);
                First.putExtra("callage",callage);
                First.putExtra("percentage",percentage);
                First.putExtra("year",year);
                First.putExtra("occupation",occupation);
                First.putExtra("company",company);
                First.putExtra("year_1",year_1);

                startActivity(First);
            }
        });

        img_btn_activity_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Second = new Intent(ResumeActivity.this,inputActivity2.class);

                Second.putExtra("name",name);
                Second.putExtra("number",number);
                Second.putExtra("mail",mail);
                Second.putExtra("address",address);
                Second.putExtra("dob",dob);
                Second.putExtra("hobbies",hobbies);
                Second.putExtra("skill",skill);
                Second.putExtra("caste",caste);
                Second.putExtra("degree",degree);
                Second.putExtra("callage",callage);
                Second.putExtra("percentage",percentage);
                Second.putExtra("year",year);
                Second.putExtra("occupation",occupation);
                Second.putExtra("company",company);
                Second.putExtra("year_1",year_1);

                startActivity(Second);
            }
        });

        img_btn_activity_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Third = new Intent(ResumeActivity.this,InputActivity3.class);

                Third.putExtra("name",name);
                Third.putExtra("number",number);
                Third.putExtra("mail",mail);
                Third.putExtra("address",address);
                Third.putExtra("dob",dob);
                Third.putExtra("hobbies",hobbies);
                Third.putExtra("skill",skill);
                Third.putExtra("caste",caste);
                Third.putExtra("degree",degree);
                Third.putExtra("callage",callage);
                Third.putExtra("percentage",percentage);
                Third.putExtra("year",year);
                Third.putExtra("occupation",occupation);
                Third.putExtra("company",company);
                Third.putExtra("year_1",year_1);

                startActivity(Third);
            }
        });

        img_btn_activity_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Fourth = new Intent(ResumeActivity.this,InputActivity4.class);

                Fourth.putExtra("name",name);
                Fourth.putExtra("number",number);
                Fourth.putExtra("mail",mail);
                Fourth.putExtra("address",address);
                Fourth.putExtra("dob",dob);
                Fourth.putExtra("hobbies",hobbies);
                Fourth.putExtra("skill",skill);
                Fourth.putExtra("caste",caste);
                Fourth.putExtra("degree",degree);
                Fourth.putExtra("callage",callage);
                Fourth.putExtra("percentage",percentage);
                Fourth.putExtra("year",year);
                Fourth.putExtra("occupation",occupation);
                Fourth.putExtra("company",company);
                Fourth.putExtra("year_1",year_1);

                startActivity(Fourth);
            }
        });

        img_btn_activity_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Fiveth = new Intent(ResumeActivity.this,InputActivity5.class);

                Fiveth.putExtra("name",name);
                Fiveth.putExtra("number",number);
                Fiveth.putExtra("mail",mail);
                Fiveth.putExtra("address",address);
                Fiveth.putExtra("dob",dob);
                Fiveth.putExtra("hobbies",hobbies);
                Fiveth.putExtra("skill",skill);
                Fiveth.putExtra("caste",caste);
                Fiveth.putExtra("degree",degree);
                Fiveth.putExtra("callage",callage);
                Fiveth.putExtra("percentage",percentage);
                Fiveth.putExtra("year",year);
                Fiveth.putExtra("occupation",occupation);
                Fiveth.putExtra("company",company);
                Fiveth.putExtra("year_1",year_1);

                startActivity(Fiveth);
            }
        });
    }
}