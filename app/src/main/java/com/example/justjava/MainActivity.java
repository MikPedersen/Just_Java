/**
        * IMPORTANT: Make sure you are using the correct package name.
        * This example uses the package name:
        * package com.example.android.justjava
        * If you get an error when copying this code into Android studio, update it to match teh package name found
        * in the project's AndroidManifest.xml file.
 **/
package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        String priceMessage = "Total: $" + quantity*5 + "\nThank you!";
        displayMessage(priceMessage);
    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        if (quantity == 100) {
            return;
        }
        quantity = quantity +1;
    display(quantity);
    }
    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view){
        if (quantity == 0) {
            return;
        }
        quantity = quantity -1;
    display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}