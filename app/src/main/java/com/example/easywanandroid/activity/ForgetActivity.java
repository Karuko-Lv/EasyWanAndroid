package com.example.easywanandroid.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.easywanandroid.R;

public class ForgetActivity extends AppCompatActivity {

    private Button mbtn_fdpassword;
    private EditText medt_spassword;
    private TextView mtv_password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);
        mbtn_fdpassword = findViewById(R.id.btn_fdpassword);
        medt_spassword = findViewById(R.id.edt_spassword);
        mbtn_fdpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("userdata",MODE_PRIVATE);//得到SharedPreferences对象
                if(medt_spassword.getText().toString().equals(sharedPreferences.getString("fdpassword",""))){
                    String password = "账号：" + sharedPreferences.getString("username","") + "密码：" + sharedPreferences.getString("password","");
                    mtv_password.setText(password);
                }
            }
        });
    }
}
