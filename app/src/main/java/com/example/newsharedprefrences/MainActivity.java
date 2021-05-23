package com.example.newsharedprefrences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
       public  static final String MessageId = "spref";
    Button button;
    TextView TextView;
    EditText messageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView = findViewById(R.id.textView);
        messageTextView = findViewById(R.id.messageEditText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String message = messageTextView.getText().toString().trim();
              /* SharedPreferences.Editor money = getSharedPreferences(MessageId,MODE_PRIVATE).edit().putInt("money",1000);
               money.apply();*/
               SharedPreferences sharedPreferences = getSharedPreferences(MessageId,MODE_PRIVATE);
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putString("message",message);

               editor.apply();
                startActivity(new Intent(MainActivity.this,Activity2.class));
            }
        });
        /*SharedPreferences getShareData = getSharedPreferences(MessageId,MODE_PRIVATE);
        String value = getShareData.getString("message","Nothing to say");
        TextView.setText(value);*/
    }
}