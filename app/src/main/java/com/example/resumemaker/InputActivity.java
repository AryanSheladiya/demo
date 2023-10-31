package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {
    TextView txt_name,txt_number,txt_mail,txt_address,txt_dob,txt_hobbies,txt_skill,txt_caste,txt_degree,txt_callage,
            txt_percentage,txt_year,txt_occupation,txt_company,txt_year_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        Intentview();
    }
    void Intentview()
    {
        txt_name=findViewById(R.id.txt_name);
        txt_number=findViewById(R.id.txt_number);
        txt_mail=findViewById(R.id.txt_mail);
        txt_address=findViewById(R.id.txt_address);
        txt_dob=findViewById(R.id.txt_dob);
        txt_hobbies=findViewById(R.id.txt_hobbies);
        txt_skill=findViewById(R.id.txt_skill);
        txt_caste=findViewById(R.id.txt_caste);
        txt_degree=findViewById(R.id.txt_degree);
        txt_callage=findViewById(R.id.txt_callage);
        txt_percentage=findViewById(R.id.txt_percentage);
        txt_year=findViewById(R.id.txt_year);
        txt_occupation=findViewById(R.id.txt_occupation);
        txt_company=findViewById(R.id.txt_company);
        txt_year_1=findViewById(R.id.txt_year_1);

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

        txt_name.setText(name);
        txt_number.setText(number);
        txt_mail.setText(mail);
        txt_address.setText(address);
        txt_dob.setText(dob);
        txt_hobbies.setText(hobbies);
        txt_skill.setText(skill);
        txt_caste.setText(caste);
        txt_degree.setText(degree);
        txt_callage.setText(callage);
        txt_percentage.setText(percentage);
        txt_year.setText(year);
        txt_occupation.setText(occupation);
        txt_company.setText(company);
        txt_year_1.setText(year_1);
    }
}