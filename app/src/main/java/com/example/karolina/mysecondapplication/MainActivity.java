package com.example.karolina.mysecondapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends Activity
{
    public void onCreate(Bundle savedInstanceState)
    {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        Button button = (Button) findViewById(R.id.button_am3);

        button.setOnClickListener(new View.OnClickListener()

        {
            public void onClick(View arg0)
            {

                Intent intent = new Intent(context, Main3Activity.class);
                startActivity(intent);

            }

            });

        }
}




