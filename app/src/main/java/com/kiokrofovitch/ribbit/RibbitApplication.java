package com.kiokrofovitch.ribbit;

import android.app.Application;

import com.kiokrofovitch.ribbit.ui.MainActivity;
import com.kiokrofovitch.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "5FWlEIdkjo904DUK5U2RXg1BZ9sCm8gLWYhM74Zs", "v9DvICz8rHC5bQJmvYSx3NG434g9qEhRxDORm3mO");

        //PushService.setDefaultPushCallback(this, MainActivity.class);
        PushService.setDefaultPushCallback(this, MainActivity.class, R.drawable.ic_stat_ic_launcher);
        ParseInstallation.getCurrentInstallation().saveInBackground();

    }

    public static void updateParseInstallation(ParseUser user){
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }

}
