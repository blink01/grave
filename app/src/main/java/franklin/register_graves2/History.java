package franklin.register_graves2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Eugene on 3/1/2018.
 */

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        returnButton();

    }

    private void returnButton() {
        Button retButton = (Button) findViewById(R.id.buttonBack22);
        retButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOne = new Intent( History.this, MainActivity.class);
                startActivity(intentOne);
            }
        });
    }
}
