package com.ciru.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaCodec;
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

public class RegisterActivity extends AppCompatActivity {
    ImageView ivLogo;
    EditText etUserName, etEmailAddress, eTPassword, etConfirmPassword;
    Button btnSignup;

    Pattern PASSWORD_PATTERN = Pattern.compile(
            "^" + "(?=.*[@#$%^&+=])" + "(?=\\S+$)" + ".{4,}" + "$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ivLogo = findViewById(R.id.ivLogo);
        etUserName = findViewById(R.id.etUserName);
        etEmailAddress = findViewById(R.id.etEmailAddress);
        eTPassword = findViewById(R.id.eTPassword);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);
        btnSignup = findViewById(R.id.btnSignup);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate();
                validateEmail();
                validatePassword();

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean validatePassword() {
        if (TextUtils.isEmpty(eTPassword.getText().toString())){
            Toast.makeText(this, "Invalid Password", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!PASSWORD_PATTERN.matcher(eTPassword.getText().toString()).matches()){
            Toast.makeText(this, "Password is Weak", Toast.LENGTH_SHORT).show();
            return false;
        } else if(etConfirmPassword != eTPassword) {
            Toast.makeText(this, "Confirm Password should be the same as Password", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }
    }

    private boolean validateEmail() {
        //        Email Validation
        if (TextUtils.isEmpty(etEmailAddress.getText().toString())){
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
            return  false;
        }
        else if (!Patterns.EMAIL_ADDRESS.matcher(etEmailAddress.getText().toString()).matches()){
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
            return false;
        }else {
            return true;
        }
    }

    private boolean validate() {
//        User Name validation
        if (TextUtils.isEmpty(etUserName.getText().toString())){
            Toast.makeText(this, "Invalid User Name", Toast.LENGTH_SHORT).show();
            return false;
        } else {
            return true;
        }

    }
}