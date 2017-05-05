package ankit.developer.unknowns.speedview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.anastr.speedviewlib.DeluxeSpeedView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        DeluxeSpeedView deluxeSpeedView= (DeluxeSpeedView) findViewById(R.id.deluxeSpeedView);

     // change speed to 140 Km/h
            deluxeSpeedView.speedTo(140);
        // set or remove Blur Effects.
        deluxeSpeedView.setWithEffects(false);

        // change Background Color of speed text.
        deluxeSpeedView.setSpeedBackgroundColor(Color.RED);
    }
}
