package franklin.register_graves2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        histButton();
        registrationButton();
        newSubmissionButton();
    }

    private void histButton() {
        Button historyButton = (Button) findViewById(R.id.historyButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, History.class);
                startActivity(intentHist);
            }
        });
    }

    private void registrationButton() {
        Button historyButton = (Button) findViewById(R.id.registrationButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, Registration.class);
                startActivity(intentHist);
            }
        });
    }

    private void newSubmissionButton() {
        ImageButton historyButton = (ImageButton) findViewById(R.id.newSubmissionButton);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, newSubmission.class);
                startActivity(intentHist);
            }
        });
    }
}


