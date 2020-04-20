package com.example.easywanandroid.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.easywanandroid.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText met_spassword, medt_user, medt_password, medt_fdpassword;
    private Button mbtn_register;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        medt_user = findViewById(R.id.edt_user);
        medt_password = findViewById(R.id.edt_password);
        met_spassword = findViewById(R.id.edt_spassword);
        medt_fdpassword = findViewById(R.id.edt_fdpassword);
        mbtn_register = findViewById(R.id.btn_register);
        sharedPreferences = getSharedPreferences("userdata", MODE_PRIVATE);//文件名是userdata
        editor = sharedPreferences.edit();
        intent = new Intent(RegisterActivity.this, LoginActivity.class);
        if (!sharedPreferences.getString("username", "").equals("")) {//就是defValue不等于""
            Toast.makeText(RegisterActivity.this, "账号已存在，若忘记请使用忘记密码", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        }
        mbtn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password, spassword;
                password = medt_password.getText().toString();
                spassword = met_spassword.getText().toString();
                if ((!medt_user.getText().toString().equals("")) && (!password.equals("")) && (!spassword.equals("")) && (!medt_fdpassword.getText().toString().equals(""))) {
                    if (password.equals(spassword)) {
                        editor.putString("username", medt_user.getText().toString());
                        editor.putString("password", password);
                        editor.putString("fdpassword", medt_fdpassword.getText().toString());
                        editor.apply();
                        Toast.makeText(RegisterActivity.this, "注册成功，2秒后跳转至登录界面", Toast.LENGTH_SHORT).show();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                startActivity(intent);
                                finish();
                            }
                        }, 2000);

                    } else
                        Toast.makeText(RegisterActivity.this, "密码不一致，请重新输入", Toast.LENGTH_SHORT).show();}
                else Toast.makeText(RegisterActivity.this, "请输入完整信息", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
