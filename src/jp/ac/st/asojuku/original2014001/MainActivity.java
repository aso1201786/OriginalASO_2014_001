package jp.ac.st.asojuku.original2014001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btn_ok =(Button)findViewById(R.id.btn_ok);
		btn_ok.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
			case R.id.btn_ok:
//				EditText etv = (EditText)findViewById(R.id.omikuji);
//				String inputMsg = etv.getText().toString();
				Random rnd = new Random();
				int ran = rnd.nextInt(4);
				Intent intent = null;
				switch(ran){
					case 0:
						intent = new Intent(MainActivity.this, DaikichiActivity.class);
						startActivity(intent);
						break;
					case 1:
						intent = new Intent(MainActivity.this, ChyuukichiActivity.class);
						startActivity(intent);
						break;
					case 2:
						intent = new Intent(MainActivity.this, KyoActivity.class);
						startActivity(intent);
						break;
					case 3:
						intent = new Intent(MainActivity.this, DaikyoActivity.class);
						startActivity(intent);
						break;
				}

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
