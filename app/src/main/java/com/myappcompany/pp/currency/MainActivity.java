package com.myappcompany.pp.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert1(View view)
    {
        EditText rs = (EditText)(findViewById(R.id.rs));
        double x=Double.parseDouble(rs.getText().toString());
        x=x*0.013;
        Toast.makeText(this, "Amount in $ = "+x, Toast.LENGTH_SHORT).show();
    }
    public void convert2(View view)
    {
        EditText dol = (EditText)(findViewById(R.id.dol));
        double x=Double.parseDouble(dol.getText().toString());
        x=x*76.28;
        Toast.makeText(this, "Amount in ₹ = "+x, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
