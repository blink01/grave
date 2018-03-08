package franklin.register_graves2;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class NearbyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby);

        SearchButton();
    }

    private void SearchButton() {
        Button srchButton = (Button) findViewById(R.id.search_nearby_btn);
        srchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchDetails = new Intent( NearbyActivity.this, ActivityLister.class);
                startActivity(searchDetails);
                finish();
            }
        });
    }


//    private void histDetailButton() {
//        Button detailButton = (Button) findViewById(R.id.hist_item_1);
//        detailButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setContentView(R.layout.history_detail);
//                histDetailReturnButton();
//            }
//        });
//    }
//
//    private void histDetailReturnButton() {
//        Button detailButton = (Button) findViewById(R.id.return_search_history);
//        detailButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                setContentView(R.layout.activity_lister);
//            }
//        });
//    }

}
