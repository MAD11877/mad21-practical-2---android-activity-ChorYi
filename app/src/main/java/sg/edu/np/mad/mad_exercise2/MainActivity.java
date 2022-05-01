package sg.edu.np.mad.mad_exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.flwbutton);

        User ur = UserDetails();
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //);
                if (ur.followed == false) {
                    ur.followed = true;
                } else {
                    ur.followed = false;
                }
                follow(ur, btn);
            }
        });
    }

    public User UserDetails() {
        User ur = new User("MAD", "Week 2 practical", 1, false);
        return ur;
    }

    public void follow(User ur, Button btn) {

        TextView txt = btn;
        if (ur.followed == false) {
            txt.setText("Follow");
        } else {
            txt.setText("Unfollow");
        }
    }
}

