package com.example.loopndswitchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtoutput = findViewById(R.id.txtoutput);
        Button btnloop = findViewById(R.id.btnloop);

        TextView txtivalue = findViewById(R.id.txtivalue);

        TextView txtswitch = findViewById(R.id.txtswitch);
        Button btnswitch = findViewById(R.id.btnswitch);

        btnloop.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=0;
                String txt = "your a value is " ;
               /* for(a=0;a<=10;a++){

                    txtoutput.setText(txt + a);
                 }*/


                /*  while (a<=10)
                {
                    txtoutput.setText(txt + a);
                    a++;
                }*/

             /*   do{
                    txtoutput.setText(txt + a);
                    a++;


                }while (a<6);

                txtivalue.setText(a + " ");*/

                for( int x =0; x<30;x++){
                    if(x==10){
                        continue;
                    }
                  /*  if(x==10){
                        continue;
                    }*/

                    Log.i("log", x + " ");
                }



            }
        });

      /*  btnswitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameString = "animeal name3";

                switch(nameString){
                    case"Animal1":
                        txtswitch.setText("our animal Name is animal1");
                        break;
                    case "animeal name":
                        txtswitch.setText("your animeal name is animal2");

                        break;
                    default:
                        txtswitch.setText("somthing else");
                }
            }
        });*/

    }
}