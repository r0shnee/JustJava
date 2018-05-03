package com.example.roshnee.justjava


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import java.text.NumberFormat


/**
 * This app displays an order form to order coffee.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * This method is called when the order button is clicked.
     */
    fun submitOrder(view: View) {

        val quantity=5;


        display(quantity);
        displayPrice(quantity *5)
    }

    fun increment(view: View){
        val quantity=3;
        display(quantity);

    }

    fun decrement(view: View){
        val quantity=1;
        display(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
        val quantityTextView = findViewById(R.id.quantity_text_view) as TextView
        quantityTextView.text = "" + number
    }

    /**
     * This method displays the given price on the screen.
     */
    private fun displayPrice(number: Int) {
        val priceTextView = findViewById(R.id.price_text_view) as TextView
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number))
    }
}