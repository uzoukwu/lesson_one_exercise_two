package com.example.lesson_one_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mydraw = "  * *     * *  ";

        Log.d("draw", mydraw);

        mydraw = "  *   * *   *    ";

        Log.d("draw", mydraw);

        mydraw = "  *         *    ";

        Log.d("draw", mydraw);

        mydraw = "    *     *      ";

        Log.d("draw", mydraw);

        mydraw = "        *        ";

        Log.d("draw", mydraw);
    }
}