package com.example.ysh.memong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddActivity extends AppCompatActivity{
    DatePicker datePicker;
    private EditText editText;
    private String title;
    private String formattedDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        editText = findViewById(R.id.title_text);
        Button btn = findViewById(R.id.addFinish);
        Button back = findViewById(R.id.btnback);

back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        finish();
    }
});


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date c = Calendar.getInstance().getTime();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                formattedDate = df.format(c);
                title = editText.getText().toString();
                Intent add = new Intent();
                add.putExtra("time",formattedDate);
                add.putExtra("title",title);
                setResult(RESULT_OK,add);
                finish();
            }
        });

    }
}
