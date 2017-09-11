package com.example.shinji.preferenceactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MyPreferenceActivity.class);
                startActivity(intent);
            }
        });

        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(v.getContext());
                String listValue        = prefs.getString("key", "");
                boolean checkboxValue   = prefs.getBoolean("key2", false);
                boolean switchValue = prefs.getBoolean("key3", false);
                Set<String> multiValues = prefs.getStringSet("multi", null);
                String textboxValue1 = prefs.getString("textbox1", "");
                String textboxValue2 = prefs.getString("textbox2", "");

                Log.w( "KEKKA", "listValue = [" + listValue + "]");
                Log.w( "KEKKA", "checkboxValue = [" + checkboxValue + "]");
                Log.w( "KEKKA", "switchValue = [" + switchValue + "]");
                if (multiValues != null) {
                    String[] multiValueArray = multiValues.toArray(new String[] {});
                    for (int i = 0; i < multiValueArray.length; i++) {
                        Log.w( "KEKKA", "multiValues = [" + multiValueArray[i] + "]");
                    }
                }
                Log.w( "KEKKA", "textboxValue1 = [" + textboxValue1 + "]");
                Log.w( "KEKKA", "textboxValue2 = [" + textboxValue2 + "]");
            }
        });
    }
}
