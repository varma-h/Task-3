package harsh.com.task_3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        Toast.makeText(getApplicationContext(), "Application Started", Toast.LENGTH_SHORT).show();

    }

    public void nextScreen(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}

