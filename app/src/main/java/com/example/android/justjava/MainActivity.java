package com.example.android.justjava;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int numberOfCoffe = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** This method ca  led when the order button is clicked**/
    public void submitOrder(View view){
        String  priceMessage = "Jumlah: " + numberOfCoffe;
        priceMessage = priceMessage + "\nHarga: Rp " + (numberOfCoffe*5);
        priceMessage = priceMessage + "\nThank you";
        displayMessage(priceMessage);
//        display(numberOfCoffe);
//        displayPrice(numberOfCoffe * 5);
    }

    /**this method run when  - button press that will increse value of numberOfCoffe by 1**/
    public void increment(View view){
        numberOfCoffe = numberOfCoffe+1;
        display(numberOfCoffe);
    }

    /**this method run when  - button press that will decrese value of numberOfCoffe by 1**/
    public void decrement(View view){
        if(numberOfCoffe>=1) {
            numberOfCoffe = numberOfCoffe - 1;
            display(numberOfCoffe);
        }
    }


    /**This method display the given quality value on the screen**/
    public void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText(""+number);
    }


    /**This method display the given quantity value on the screen**/
//    private void displayPrice(int number){
//        TextView priceTextView = (TextView) findViewById(R.id.sumarry_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
//    }

    /** this method display aditional message on display**/
    private void displayMessage(String message){
        TextView summaryTextView = (TextView) findViewById(R.id.sumarry_text_view);
        summaryTextView.setText(message);
    }

}
