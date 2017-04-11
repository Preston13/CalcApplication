package cool.me.coolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sevenClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "7");
    }

    public void eightClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "8");
    }

    public void nineClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "9");
    }

    public void multiplyClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(result.getText() + "X");
    }
}
