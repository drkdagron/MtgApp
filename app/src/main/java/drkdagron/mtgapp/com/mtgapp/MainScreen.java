package drkdagron.mtgapp.com.mtgapp;

import android.graphics.Color;
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
    int p1Poison = 0;
    int p2Poison = 0;

    boolean p1L = true;    //true = life, false = poison
    boolean p2L = true;    //true = life, false = poison

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
        p1Buf.setTextColor(Color.GREEN);
        p1LifeBtn = (Button)findViewById(R.id.p1LBtn);
        p1LifeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(false, 1);
                UpdateLives();
            }
        });
        p1PoisonBtn = (Button)findViewById(R.id.p1PBtn);
        p1PoisonBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(true, 1); UpdateLives();
            }
        });

        p2Buf = (TextView)findViewById(R.id.p2buf);
        p2Buf.setTextColor(Color.GREEN);
        p2LifeBtn = (Button)findViewById(R.id.p2LBtn);
        p2LifeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(false, 2); UpdateLives();
            }
        });
        p2PoisonBtn = (Button)findViewById(R.id.p2PBtn);
        p2PoisonBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                ChangeLife(true, 2); UpdateLives();
            }
        });

        p1txt = (TextView)findViewById(R.id.p1Life);
        p1txt.setTextColor(Color.RED);
        p2txt = (TextView)findViewById(R.id.p2Life);
        p2txt.setTextColor(Color.RED);

        p1P1 = (Button)findViewById(R.id.p1Add1);
        p1P1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p1L) {
                    p1Life++;
                    UpdateLives();
                } else {
                    p1Poison++;
                    UpdateLives();
                }
            }
        });
        p1P5 = (Button)findViewById(R.id.p1Add5);
        p1P5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p1L) {
                    p1Life += 5;
                    UpdateLives();
                } else {
                    p1Poison += 5;
                    UpdateLives();
                }
            }
        });
        p1S1 = (Button)findViewById(R.id.p1Sub1);
        p1S1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p1L) {
                    p1Life--;
                    UpdateLives();
                } else {
                    p1Poison--;
                    UpdateLives();
                }
            }
        });
        p1S5 = (Button)findViewById(R.id.p1Sub5);
        p1S5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p1L) {
                    p1Life -= 5;
                    UpdateLives();
                } else {
                    p1Poison -= 5;
                    UpdateLives();
                }
            }
        });

        p2P1 = (Button)findViewById(R.id.p2Add1);
        p2P1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p2L) {
                    p2Life++;
                    UpdateLives();
                } else {
                    p2Poison++;
                    UpdateLives();
                }
            }
        });
        p2P5 = (Button)findViewById(R.id.p2Add5);
        p2P5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p2L) {
                    p2Life+=5;
                    UpdateLives();
                } else {
                    p2Poison+=5;
                    UpdateLives();
                }
            }
        });
        p2S1 = (Button)findViewById(R.id.p2Sub1);
        p2S1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p2L) {
                    p2Life--;
                    UpdateLives();
                } else {
                    p2Poison--;
                    UpdateLives();
                }
            }
        });
        p2S5 = (Button)findViewById(R.id.p2Sub5);
        p2S5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                if (p2L) {
                    p2Life-=5;
                    UpdateLives();
                } else {
                    p2Poison-=5;
                    UpdateLives();
                }
            }
        });
    }

    public void ChangeLife(boolean poison, int player)
    {
        if (player == 1)
        {
            if (poison == true)
            {
                p1L = false;
                p1txt.setTextColor(Color.GREEN);
                p1Buf.setTextColor(Color.RED);
            }
            else
            {
                p1L = true;
                p1txt.setTextColor(Color.RED);
                p1Buf.setTextColor(Color.GREEN);
            }
        }
        else if (player == 2)
        {
            if (poison == true)
            {
                p2L = false;
                p2txt.setTextColor(Color.GREEN);
                p2Buf.setTextColor(Color.RED);
            }
            else
            {
                p2L = true;
                p2txt.setTextColor(Color.RED);
                p2Buf.setTextColor(Color.GREEN);
            }
        }
    }

    public void UpdateLives()
    {
        if (p1L == true)
        {
            p1txt.setText(String.valueOf(p1Life));
            p1Buf.setText(String.valueOf(p1Poison));
        } else {
            p1Buf.setText(String.valueOf(p1Life));
            p1txt.setText(String.valueOf(p1Poison));
        }

        if (p2L == true) {
            p2txt.setText(String.valueOf(p2Life));
            p2Buf.setText(String.valueOf(p2Poison));
        } else {
            p2Buf.setText(String.valueOf(p2Life));
            p2txt.setText(String.valueOf(p2Poison));
        }
    }
}
