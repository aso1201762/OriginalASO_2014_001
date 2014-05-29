package com.example.originalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	
	
	
	Button btn = (Button)findViewById(R.id.button1);
    btn.setOnClickListener(new View.OnClickListener() {
	@Override
	public void onClick(View v){
		
		
		//EditText etv = (EditText)findViewById(R.id.nametext);
		//String inputMsg = etv.getText().toString();
		
		//Randomクラスのインスタンスを作る
		Random rnd = new Random();
		
		int ran = rnd.nextInt(4);
		
		
		Intent intent = null;
		
		switch(ran){
		case 0:
			intent = new Intent(MainActivity.this, DaikichiActivity.class);
			startActivity(intent);
			break;
		case 1:
			intent = new Intent(MainActivity.this, ChuukichiActivity.class);
			startActivity(intent);
			break;
		case 2:
			intent = new Intent(MainActivity.this, KyouActivity.class);
			startActivity(intent);
			break;
		case 3:
			intent = new Intent(MainActivity.this, DaikyouActivity.class);
			startActivity(intent);
			break;
		}
		
		
		
		
		
	
    }
	
	
    });
	}
}
