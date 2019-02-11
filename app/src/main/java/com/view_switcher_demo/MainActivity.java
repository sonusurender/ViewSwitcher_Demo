package com.view_switcher_demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class MainActivity extends Activity {
	Button pre, nex, click;
	ViewSwitcher view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		pre = (Button) findViewById(R.id.prev);
		nex = (Button) findViewById(R.id.next);
		click = (Button) findViewById(R.id.click);
		view = (ViewSwitcher) findViewById(R.id.viewSwitcher1);

		pre.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				// Show Previous View
				view.showPrevious();

			}
		});
		nex.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				// Show Next View
				view.showNext();
			}
		});

		click.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				// Show Toast on second View Button Click
				Toast.makeText(MainActivity.this, "You clicked on Button",
						Toast.LENGTH_SHORT).show();
			}
		});
	}

}
