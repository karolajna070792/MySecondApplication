package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Question_1_Analize extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1_analize);
        addListenerOnButton();
    }

    private void addListenerOnButton()  {

        final Context context = this;

        Button next_odp = (Button) findViewById(R.id.nastepna_odp_btn);

        next_odp.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Question_2_Analize.class);
                startActivity(intent);

            }

        });

    }

}
