package io.bigsoft.android.display;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXT_KEY = "Display Joke";

    TextView mJokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        mJokeTextView = findViewById(R.id.tv_joke);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            if (bundle.containsKey(EXT_KEY)){
                mJokeTextView.setText(bundle.getString(EXT_KEY));
            }
        }
    }
}
