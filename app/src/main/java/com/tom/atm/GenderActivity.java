package com.tom.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }

    public void next (View view){

        EditText edGender = findViewById(R.id.ed_gender);
        String gender = edGender.getText().toString();
        getSharedPreferences("user", MODE_PRIVATE).edit().putString("GENDER", gender).apply();
        Intent main = new Intent(this, MainActivity.class);
        setResult(RESULT_OK);
        main.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(main);
    }
    public void back(View view){
        finish();
    }
}
