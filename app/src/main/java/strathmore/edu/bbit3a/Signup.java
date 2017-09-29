package strathmore.edu.bbit3a;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Signup extends AppCompatActivity implements View.OnClickListener {

    Button breg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final Button breg = (Button) findViewById(R.id.breg);

        breg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Signup.this,Home.class));
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
