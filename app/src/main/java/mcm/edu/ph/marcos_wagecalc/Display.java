package mcm.edu.ph.marcos_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

// Regular Employee:
// 1-8 hours(regular work time): 100 pesos per hour
// Probationary Employee:
// 1-8 hours: 90 pesos per hour
// Part-time workers:
// 1-8 hours: 75 pesos per hour

public class Display extends AppCompatActivity {

    TextView txtName,txtType,txtHours,txtWage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        txtName = findViewById(R.id.txtEmployeeName);
        txtType = findViewById(R.id.txtEmployeeType);
        txtHours = findViewById(R.id.employeeHours);
        txtWage = findViewById(R.id.txtTotalWage);



        Intent i = getIntent();

        String EmployeeName = i.getStringExtra("empName");
        String EmployeeType = i.getStringExtra("type");
        Double EmployeeHours = Double.parseDouble(i.getStringExtra("hours"));


        txtName.setText("EmployeeName: "+ EmployeeName);
        txtType.setText("Employee Type: "+ String.valueOf(EmployeeHours));
        txtHours.setText("Hours Rendered: "+ String.valueOf(EmployeeHours));


        if(EmployeeHours<=8){
            if
        }


    }
}