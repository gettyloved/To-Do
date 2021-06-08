package com.ciru.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    TextView  tvForgotPassword, tvAccount;
    EditText etEmail, etPassword;
    ImageView ivLogo;
    Button btnLogin;
    Pattern PASSWORD_PATTERN = Pattern.compile(
            "^" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{4,}" + "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ivLogo = findViewById(R.id.ivLogo);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);
        tvAccount = findViewById(R.id.tvAccount);
        etEmail = findViewById(R.id.etEmail);
        etPassword =findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validatePassword();
                validateEmail();
            }
        });

        tvAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean validatePassword() {
        if (TextUtils.isEmpty(etPassword.getText().toString())){
            Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!PASSWORD_PATTERN.matcher(etPassword.getText().toString()).matches()){
            Toast.makeText(this, "Password is Weak", Toast.LENGTH_SHORT).show();
            return false;
        }  else {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }
    }

    private boolean validateEmail() {
        //        Email Validation
        if (TextUtils.isEmpty(etEmail.getText().toString())){
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
            return  false;
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(etEmail.getText().toString()).matches()){
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
            return false;
        }else {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
            return true;
        }
    }

}