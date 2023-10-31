package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_name,edt_number,edt_mail,edt_address,edt_dob,edt_hobbies,edt_skill,edt_degree,edt_university,edt_percentage,
            edt_year,edt_occupation,edt_company,edt_year_1;
    Button btn_submit;
    RadioGroup rg_caste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intentview();
    }
    void intentview()
    {
        edt_name=findViewById(R.id.edt_name);
        edt_number=findViewById(R.id.edt_number);
        edt_mail=findViewById(R.id.edt_mail);
        edt_address=findViewById(R.id.edt_address);
        btn_submit=findViewById(R.id.btn_submit);
        edt_dob=findViewById(R.id.edt_dob);
        edt_hobbies=findViewById(R.id.edt_hobbies);
        edt_skill=findViewById(R.id.edt_skill);
        rg_caste=findViewById(R.id.rg_caste);
        edt_degree=findViewById(R.id.edt_degree);
        edt_university=findViewById(R.id.edt_university);
        edt_percentage=findViewById(R.id.edt_percentage);
        edt_year=findViewById(R.id.edt_year);
        edt_occupation=findViewById(R.id.edt_occupation);
        edt_company=findViewById(R.id.edt_company);
        edt_year_1=findViewById(R.id.edt_year_1);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ResumeActivity.class);

                String name = edt_name.getText().toString();
                String number = edt_number.getText().toString();
                String mail = edt_mail.getText().toString();
                String address = edt_address.getText().toString();
                String dob = edt_dob.getText().toString();
                String hobbies = edt_hobbies.getText().toString();
                String skill = edt_skill.getText().toString();
                String caste = ((RadioButton)findViewById(rg_caste.getCheckedRadioButtonId())).getText().toString();
                String degree = edt_degree.getText().toString();
                String callage = edt_university.getText().toString();
                String percentage = edt_percentage.getText().toString();
                String year = edt_year.getText().toString();
                String occupation = edt_occupation.getText().toString();
                String company = edt_company.getText().toString();
                String year_1 = edt_year_1.getText().toString();


                intent.putExtra("name",name);
                intent.putExtra("number",number);
                intent.putExtra("mail",mail);
                intent.putExtra("address",address);
                intent.putExtra("dob",dob);
                intent.putExtra("hobbies",hobbies);
                intent.putExtra("skill",skill);
                intent.putExtra("caste",caste);
                intent.putExtra("degree",degree);
                intent.putExtra("callage",callage);
                intent.putExtra("percentage",percentage);
                intent.putExtra("year",year);
                intent.putExtra("occupation",occupation);
                intent.putExtra("company",company);
                intent.putExtra("year_1",year_1);

                startActivity(intent);
            }
        });
    }
}