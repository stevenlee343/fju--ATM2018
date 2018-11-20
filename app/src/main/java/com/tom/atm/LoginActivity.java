package com.tom.atm;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText edUserid = findViewById(R.id.ed_userid);
        SharedPreferences setting = getSharedPreferences("atm", MODE_PRIVATE);
        edUserid.setText(setting.getString("PREF_USERID",""));
 
    }

    public void login(View view) {
        String userid = ((EditText)findViewById(R.id.ed_userid)).getText().toString();
        String passwd = ((EditText)findViewById(R.id.ed_password)).getText().toString();
        if ("jack".equals(userid) && "1234".equals(passwd)) {
            setResult(RESULT_OK);
            getSharedPreferences("atm", MODE_PRIVATE).edit().putString("USERID", userid).apply();

            finish();
        }
    }
}
