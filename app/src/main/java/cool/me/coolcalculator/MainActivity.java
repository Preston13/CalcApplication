package cool.me.coolcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    String firstValue = "";
    String secondValue = "";
    String operation = null;
    double calculation = 0.0;
    String value = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sevenClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "7");
        value += "7";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "7";
        }
        else {
            firstValue += "7";
        }
    }

    public void eightClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "8");
        value += "8";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "8";
        }
        else {
            firstValue += "8";
        }
    }

    public void nineClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "9");
        value += "9";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "9";
        }
        else {
            firstValue += "9";
        }
    }

    public void multiplyClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "X");
        value += "X";
        operation = "multiply";
    }

    public void clearClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText("0");
        value = "";
    }

    public void plus_minusClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText("-" + value);
    }

    public void percentClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        double percentValue = Double.parseDouble(firstValue) / 100.0;
        result.setText(Double.toString(percentValue));
        value = "";
        firstValue = "";
    }

    public void divisionClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "/");
        value += "/";
        operation = "divide";
    }

    public void fourClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "4");
        value += "4";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "4";
        }
        else {
            firstValue += "4";
        }
    }

    public void fiveClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "5");
        value += "5";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "5";
        }
        else {
            firstValue += "5";
        }
    }

    public void sixClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "6");
        value += "6";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "6";
        }
        else {
            firstValue += "6";
        }
    }

    public void minusClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "-");
        value += "-";
        operation = "subtract";
    }

    public void threeClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "3");
        value += "3";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "3";
        }
        else {
            firstValue += "3";
        }
    }

    public void twoClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "2");
        value += "2";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "2";
        }
        else {
            firstValue += "2";
        }
    }

    public void oneClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "1");
        value += "1";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "1";
        }
        else {
            firstValue += "1";
        }
    }

    public void plusClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "+");
        value += "+";
        operation = "add";
    }

    public void zeroClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + "0");
        value += "0";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += "0";
        }
        else {
            firstValue += "0";
        }
    }

    public void decimalClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);
        result.setText(value + ".");
        value += ".";
        if (value.contains("+") || value.contains("X") || value.contains("/") || value.contains("-")){
            secondValue += ".";
        }
        else {
            firstValue += ".";
        }
    }

    public void equalsClicked(View view) {
        result = (TextView) findViewById(R.id.result_text);

        double first = Double.parseDouble(firstValue);
        double second = Double.parseDouble(secondValue);

        if (operation.equals("multiply")){
            calculation = first * second;
        }
        else if (operation.equals("divide")){
            calculation = first / second;
        }
        else if (operation.equals("add")){
            calculation = first + second;
        }
        else if (operation.equals("subtract")){
            calculation = first - second;
        }
        else {
            calculation = first;
        }

        if (value.contains(".")){
            result.setText(Double.toString(calculation));
        }
        else {
            result.setText(Integer.toString((int)calculation));
        }

        value = "";
        firstValue = "";
        secondValue = "";
    }
}
