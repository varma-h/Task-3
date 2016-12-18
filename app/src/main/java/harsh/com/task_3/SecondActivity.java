package harsh.com.task_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        TextView textView = new TextView(this);
        textView.setText("Task-3 Completed");

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_second);
        layout.addView(textView);
    }
}
