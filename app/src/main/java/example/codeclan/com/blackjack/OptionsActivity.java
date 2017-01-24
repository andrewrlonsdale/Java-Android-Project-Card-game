package example.codeclan.com.blackjack;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

import example.codeclan.com.blackjack.R;

import static example.codeclan.com.blackjack.R.color.color_blue;
import static example.codeclan.com.blackjack.R.color.color_green;
import static example.codeclan.com.blackjack.R.color.color_red;

/**
 * Created by user on 21/01/2017.
 */
public class OptionsActivity extends AppCompatActivity {

    Intent intent3;
    RadioButton green, red, blue, deck1, deck2, deck3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        green = (RadioButton)findViewById(R.id.radioButton1);
        red = (RadioButton)findViewById(R.id.radioButton2);
        blue = (RadioButton)findViewById(R.id.radioButton3);
        deck1 = (RadioButton)findViewById(R.id.radioButton4);
        deck2 = (RadioButton)findViewById(R.id.radioButton5);
        deck3 = (RadioButton)findViewById(R.id.radioButton6);

        intent3 = new Intent(OptionsActivity.this, OptionsActivity.class);

        Log.d(getClass().toString(), "on create called");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_option) {
            startActivity(intent3);
            Log.d(getClass().toString(), "Options selected");
        }
        return super.onOptionsItemSelected(item);
    }

    public void onGreenButtonClick(View view) {
        Log.d("PersistenceExample:", "green Button Clicked!");
            getResources().getColor(color_green);
    }

    public void onRedButtonClick(View view) {
        Log.d("PersistenceExample:", "red Button Clicked!");
        getResources().getColor(color_red);
    }

    public void onBlueButtonClick(View view) {
        Log.d("PersistenceExample:", "blue Button Clicked!");
        getResources().getColor(color_blue);
    }

    public void onDeck1ButtonClick(View view) {
        Log.d("PersistenceExample:", "blue Button Clicked!");
        getResources().getColor(color_blue);
    }

    public void onDeck2ButtonClick(View view) {
        Log.d("PersistenceExample:", "blue Button Clicked!");
        getResources().getColor(color_blue);
    }

    public void onDeck3ButtonClick(View view) {
        Log.d("PersistenceExample:", "blue Button Clicked!");
        getResources().getColor(color_blue);
    }


}
