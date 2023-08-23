package com.example.ferret;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class ResetPassword extends AppCompatActivity {


    public static final String TAG = "Reset";

    EditText mEditTextEmail;

    TextView mTextViewCancel;

 //   private AppCompatActivity, mTextViewAlreadyLogin;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.senha);

        mEditTextEmail = findViewById(R.id.editText_email_resetpassword);


        //mTextViewCancel


    }
}





