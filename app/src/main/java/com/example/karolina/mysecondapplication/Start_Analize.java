package com.example.karolina.mysecondapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Analize extends AppCompatActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_analize);
        addListenerOnButton();
    }


    private void addListenerOnButton()  {

        final Context context = this;

        Button rozpocznij_analize = (Button) findViewById(R.id.rozpocznij_analize_btn);

        rozpocznij_analize.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Question1.class);
                startActivity(intent);

            }

        });

    }

}
