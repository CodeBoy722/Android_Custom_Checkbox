package com.codeboy.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox normal = findViewById(R.id.normal);

        /*fab.setOnClickListener(view -> {
            if(mBound){
                EqualizerFragment equalizer = new EqualizerFragment();
                equalizer.show(getSupportFragmentManager(),"equalizer");
            }else{
                Snackbar.make(view, MainActivity.this.getString(R.string.equalizer_show), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }*/




    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {



    }

}
