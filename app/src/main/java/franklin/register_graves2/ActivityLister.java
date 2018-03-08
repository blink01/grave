package franklin.register_graves2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister);

        returnButton();
    }

    private void returnButton() {
        Button retButton = (Button) findViewById(R.id.hist_back_btn);
        retButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnHome = new Intent( ActivityLister.this, MainActivity.class);
                startActivity(returnHome);
            }
        });
    }
}
