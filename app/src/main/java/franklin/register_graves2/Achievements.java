package franklin.register_graves2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Eugene on 3/5/2018.
 */

public class Achievements extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        returnButton();

    }

    private void returnButton() {
        Button retButton = (Button) findViewById(R.id.buttonBack2);
        retButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent( Achievements.this, MainActivity.class);
                startActivity(intentOne);
            }
        });
    }
}
