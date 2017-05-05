package ankit.developer.unknowns.speedview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.anastr.speedviewlib.SpeedView;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpeedView speedView = (SpeedView) findViewById(R.id.speedView);
        button=(Button)findViewById(R.id.button1);
        // change MAX speed to 320
                speedView.setMaxSpeed(320);
        // change speed to 140 Km/h
                speedView.speedTo(140);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
