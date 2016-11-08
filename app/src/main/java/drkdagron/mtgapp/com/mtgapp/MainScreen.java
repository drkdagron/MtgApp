package drkdagron.mtgapp.com.mtgapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainScreen extends AppCompatActivity {

    LinearLayout layout;

    int p1Life = 20;
    int p2Life = 20;

    TextView p1txt;
    TextView p2txt;

    Button p1P1;
    Button p1P5;
    Button p1S1;
    Button p1S5;

    Button p2P1;
    Button p2P5;
    Button p2S1;
    Button p2S5;

    TextView p1Buf;
    Button p1LifeBtn;
    Button p1PoisonBtn;

    TextView p2Buf;
    Button p2LifeBtn;
    Button p2PoisonBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        layout = (LinearLayout)findViewById(R.id.mainLayout);

        p1Buf = (TextView)findViewById(R.id.p1buf);
        p1LifeBtn = (Button)findViewById(R.id.p1LBtn);
        p1LifeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(false, 1);
            }
        });
        p1PoisonBtn = (Button)findViewById(R.id.p1PBtn);
        p1PoisonBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(true, 1);
            }
        });

        p2Buf = (TextView)findViewById(R.id.p2buf);
        p2LifeBtn = (Button)findViewById(R.id.p2LBtn);
        p2LifeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(false, 2);
            }
        });
        p2PoisonBtn = (Button)findViewById(R.id.p2PBtn);
        p2PoisonBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(true, 2);
            }
        });

        p1txt = (TextView)findViewById(R.id.p1Life);
        p2txt = (TextView)findViewById(R.id.p2Life);

        p1P1 = (Button)findViewById(R.id.p1Add1);
        p1P1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p1Life++;
                UpdateLives();
            }
        });
        p1P5 = (Button)findViewById(R.id.p1Add5);
        p1P5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p1Life+= 5;
                UpdateLives();
            }
        });
        p1S1 = (Button)findViewById(R.id.p1Sub1);
        p1S1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p1Life--;
                UpdateLives();
            }
        });
        p1S5 = (Button)findViewById(R.id.p1Sub5);
        p1S5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p1Life-=5;
                UpdateLives();
            }
        });

        p2P1 = (Button)findViewById(R.id.p2Add1);
        p2P1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p2Life++;
                UpdateLives();
            }
        });
        p2P5 = (Button)findViewById(R.id.p2Add5);
        p2P5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p2Life+= 5;
                UpdateLives();
            }
        });
        p2S1 = (Button)findViewById(R.id.p2Sub1);
        p2S1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p2Life--;
                UpdateLives();
            }
        });
        p2S5 = (Button)findViewById(R.id.p2Sub5);
        p2S5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                p2Life-=5;
                UpdateLives();
            }
        });
    }

    public void ChangeLife(boolean poison, int player)
    {
        if (player == 1)
        {
            if (poison == true)
            {
                
            }
            else
            {

            }
        }
        else if (player == 2)
        {
            if (poison == true)
            {

            }
            else
            {

            }
        }
    }

    public void UpdateLives()
    {
        p1txt.setText(String.valueOf(p1Life));
        p2txt.setText(String.valueOf(p2Life));
    }
}
