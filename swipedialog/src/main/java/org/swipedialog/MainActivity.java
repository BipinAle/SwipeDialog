package org.swipedialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import SwipeDialog.SwipeDismissDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showAlertDialog();
    }

    private void showAlertDialog() {
        new SwipeDismissDialog.Builder(this)
                .setLayoutResId(R.layout.dialog_success_booking)
                .build()
                .show();
    }
}
