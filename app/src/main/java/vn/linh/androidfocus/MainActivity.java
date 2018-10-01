package vn.linh.androidfocus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    View aView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aView2 = findViewById(R.id.a_view2);

        findViewById(R.id.button_change_focus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aView2.requestFocus();
            }
        });

        aView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click view2", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
