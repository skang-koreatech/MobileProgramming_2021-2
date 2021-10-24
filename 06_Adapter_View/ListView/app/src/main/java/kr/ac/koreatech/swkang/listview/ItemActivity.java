package kr.ac.koreatech.swkang.listview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Intent intent = getIntent();
        String data = intent.getStringExtra("item");

        TextView tv = findViewById(R.id.textView);
        tv.setText(data);
    }
}
