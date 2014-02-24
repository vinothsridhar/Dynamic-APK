package com.sri.apk2web;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Apk2Web extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Uri localhost=Uri.parse("http://10.0.2.2/");
		Intent i=new Intent(Intent.ACTION_VIEW,localhost);
		Intent chooser=Intent.createChooser(i,Intent.ACTION_CHOOSER);
		startActivity(chooser);
		finish();
	}

}
