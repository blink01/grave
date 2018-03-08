package franklin.register_graves2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tim N on 3/6/2018.
 */

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lister);

        returnButton();
        histDetailButton();
    }

    private void returnButton() {
        Button retButton = (Button) findViewById(R.id.hist_back_btn);
        retButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnhome = new Intent(History.this, MainActivity.class);
                startActivity(returnhome);
                finish();
            }
        });
    }

    private void histDetailButton() {
        Button detailButton = (Button) findViewById(R.id.hist_item_1);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.history_detail);
                histDetailReturnButton();
            }
        });
    }

    private void histDetailReturnButton() {
        Button detailButton = (Button) findViewById(R.id.return_search_history);
        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_lister);
                returnButton();
            }
        });
    }



}
