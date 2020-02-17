package com.codeboy.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox normal;
    CheckBox square;
    CheckBox round;
    CheckBox star;
    CheckBox tick;
    CheckBox cancel;
    ConstraintLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = findViewById(R.id.parent);
        CheckBox normal = findViewById(R.id.normal);
        CheckBox square = findViewById(R.id.square);
        CheckBox round = findViewById(R.id.round);
        CheckBox star = findViewById(R.id.star);
        CheckBox tick = findViewById(R.id.tick);
        CheckBox cancel = findViewById(R.id.cancel);

        normal.setOnCheckedChangeListener(this);
        square.setOnCheckedChangeListener(this);
        round.setOnCheckedChangeListener(this);
        star.setOnCheckedChangeListener(this);
        tick.setOnCheckedChangeListener(this);
        cancel.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        //int id = buttonView.getId();

        Snackbar.make(parent, "value is "+isChecked, Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();

    }

}
