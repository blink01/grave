package franklin.register_graves2;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.support.design.widget.NavigationView;
        import android.support.v4.view.GravityCompat;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Button;
        import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

  /*      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        histButton();
        achievementsButton();
        nearbyButton();
        newSubmissionButton();
        registerButton();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.landing, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_login) {

        } else if (id == R.id.nav_history) {
            Button historyButton = (Button) findViewById(R.id.nav_history);
            historyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Intent intentHist = new Intent(MainActivity.this, History.class);
                    startActivity(new Intent(MainActivity.this, History.class));
                }
            });
        } else if (id == R.id.nav_nearby_graves) {

        } else if (id == R.id.nav_new_submission) {

        } else if (id == R.id.nav_user_registration) {

        } else if (id == R.id.nav_achievement) {
            Button achieveButton = (Button) findViewById(R.id.nav_achievement);
            achieveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, Achievements.class));
                }
            });
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void histButton() {
        Button historyButton = (Button) findViewById(R.id.nav_history);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, History.class);
                startActivity(intentHist);
            }
        });
    }

    private void achievementsButton() {
        Button historyButton = (Button) findViewById(R.id.nav_achievements);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, Achievements.class);
                startActivity(intentHist);
            }
        });
    }

    private void nearbyButton() {
        Button historyButton = (Button) findViewById(R.id.nav_nearby);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, NearbyActivity.class);
                startActivity(intentHist);
            }
        });
    }
    private void registerButton() {
        Button historyButton = (Button) findViewById(R.id.nav_registration);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, Registration.class);
                startActivity(intentHist);
            }
        });
    }

    private void newSubmissionButton() {
        ImageButton historyButton = (ImageButton) findViewById(R.id.nav_submission);
        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHist = new Intent(MainActivity.this, newSubmission.class);
                startActivity(intentHist);
            }
        });
    }
}



