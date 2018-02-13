package chaimonkol.krirk.ac.th.projectstart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import chaimonkol.krirk.ac.th.projectstart.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment
        if (savedInstanceState == null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMain, new MainFragment())
                    .commit();
        }

    }

}
