package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question_1_Analize extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_1_analize);
        addListenerOnButton();
    }

    private void addListenerOnButton()  {

        final Context context = this;

        Button zamek_czocha = (Button) findViewById(R.id.zamek_czocha_btn);

        zamek_czocha.setTextColor(0xffffff00);

        Button zamek_ksiaz = (Button) findViewById(R.id.zamek_ksiaz_btn);

        zamek_ksiaz.setTextColor(0xff0000ff);

        Button next_odp = (Button) findViewById(R.id.nastepna_odp_btn);

        Button good_answer = (Button) findViewById(R.id.palac_moszna_btn);

        good_answer.getBackground().setColorFilter(0xff00ff00, PorterDuff.Mode.MULTIPLY);



        next_odp.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Question_2_Analize.class);
                startActivity(intent);

            }

        });

    }

}
