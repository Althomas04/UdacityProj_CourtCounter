package app.com.example.althomas04.courtcounter;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays a court counter form to count scores.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method displays the given score for team A on the screen.
     */
    private void displayA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + number);
    }

    /**
     * This method displays the given score for team B on the screen.
     */

    private void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText("" + number);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void threePointA(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }
    public void twoPointA(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }
    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }
    public void threePointB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }
    public void twoPointB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }
    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
    public void cursorA(View v){
        final EditText nameEditView = (EditText) findViewById(R.id.team_a_name);
        if (v.getId() == nameEditView.getId())
        {
            nameEditView.setCursorVisible(true);
        }
        nameEditView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                nameEditView.setCursorVisible(false);
                if (event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(nameEditView.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
                return false;
            }
        });
    }
    public void cursorB(View v){
        final EditText nameEditView = (EditText) findViewById(R.id.team_b_name);
        if (v.getId() == nameEditView.getId())
        {
            nameEditView.setCursorVisible(true);
        }
        nameEditView.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId,
                                          KeyEvent event) {
                nameEditView.setCursorVisible(false);
                if (event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) {
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(nameEditView.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
                return false;
            }
        });
    }
}
