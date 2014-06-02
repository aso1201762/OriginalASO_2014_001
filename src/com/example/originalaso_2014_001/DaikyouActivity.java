package com.example.originalaso_2014_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DaikyouActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikyou);
		
Intent intent = getIntent();
		
		String name = intent.getStringExtra("name");
		
		TextView tv = (TextView)findViewById(R.id.txvMsg);
		tv.setText(name + "さんの今日の運勢は・・・");
}
}
