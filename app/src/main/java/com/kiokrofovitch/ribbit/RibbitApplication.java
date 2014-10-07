package com.kiokrofovitch.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application{
	
	@Override
	public void onCreate() {
		super.onCreate();
		Parse.initialize(this, "5FWlEIdkjo904DUK5U2RXg1BZ9sCm8gLWYhM74Zs", "v9DvICz8rHC5bQJmvYSx3NG434g9qEhRxDORm3mO");

	}
	
}
