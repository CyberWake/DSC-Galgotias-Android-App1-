package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		Button b = findViewById(R.id.Button);
		b.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View p1)
			{
				EditText e1 = findViewById(R.id.EditText1);
				EditText e2 = findViewById(R.id.EditText2);
				String email = e1.getText().toString();
				String pass = e2.getText().toString();
				int pos = email.indexOf("@");
				pos-=1;
				String word = pass.substring(0,pos+1);
				if(pass.equals(word)){
					Toast.makeText(getBaseContext(), "Logging in " +email , Toast.LENGTH_SHORT ).show(); 
				}  
				else{
					Toast.makeText(getBaseContext(), "Wrong Password" , Toast.LENGTH_SHORT ).show();  
				}
			}
		});
	}
}
