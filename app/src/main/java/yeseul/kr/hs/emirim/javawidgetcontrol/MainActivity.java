package yeseul.kr.hs.emirim.javawidgetcontrol;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text1 = (TextView) findViewById(R.id.text1);
        TextView text2 = (TextView) findViewById(R.id.text2);
        TextView text3 = (TextView) findViewById(R.id.text3);
        TextView text4 = (TextView) findViewById(R.id.text4);

        text1.setText("First TextView");
        text1.setTextSize(30); //메소드로 설정할 경우 단위는 px
        text1.setBackgroundColor(Color.rgb(255,0,255));
        text1.setTextColor(Color.WHITE);

        text2.setText(R.string.text2_str);
        text2.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        text3.setText(R.string.text3_str);
        text3.setTextColor(Color.rgb(255,255,0));
        text3.setTextSize(50);
        text3.setBackgroundColor(Color.argb(30,0,100,200));
    }
}
