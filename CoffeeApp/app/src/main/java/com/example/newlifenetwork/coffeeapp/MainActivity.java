package com.example.newlifenetwork.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView quantity = (TextView) findViewById(R.id.Quantity);
        final EditText coffee = (EditText) findViewById(R.id.coffee);
        final TextView pricing = (TextView) findViewById(R.id.Pricing);
        Button order = (Button) findViewById(R.id.order);
        final int price = 5;
        order.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int sum = price*Integer.parseInt(coffee.getText().toString());
                pricing.setText(sum+"$");
            }
        });
    }
}
