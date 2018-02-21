package sdu.cs58.sangsit.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //ประกาศตัวแปร
    EditText number1EditText, number2EditText;
    Button addButton,deleteButton,multipayButton,divideButton;
    TextView resultTextView;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. ผูกตัวแปรบน java ใช้คู่กับ XML
        number1EditText = findViewById(R.id.editNumber1);
        number2EditText = findViewById(R.id.editNumber2);
        addButton = findViewById(R.id.btnAdd);
        deleteButton = findViewById(R.id.bntDelete);
        multipayButton = findViewById(R.id.bntMultiply);
        divideButton = findViewById(R.id.bntDivide);
        resultTextView = findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // แปลงค่าที่รับจาก EditText เป็นตัวเลข แล้วเก็บลงในตัวแปลชนิด int
                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                result = num1 + num2;

                //แสดงผลลัพท์การคำนวน
                resultTextView.setText(result + "");

                deleteButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                        result = num1 - num2;

                        //แสดงผลลัพท์การคำนวน
                        resultTextView.setText(result + "");

                        multipayButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                result = num1 * num2;

                                //แสดงผลลัพท์การคำนวน
                                resultTextView.setText(result + "");
                                divideButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        num1 = Integer.parseInt(number1EditText.getText().toString().trim());
                                        num2 = Integer.parseInt(number2EditText.getText().toString().trim());
                                        result = num1 / num2;

                                        //แสดงผลลัพท์การคำนวน
                                        resultTextView.setText(result + "");
                                    }
                                });
                            }
                        });
                    }
                });
            }
        }); // end setOnClickListener
    } //end method on Create
} //end Class
