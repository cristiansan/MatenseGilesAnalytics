package test.com.analytics;

import android.app.Application;


import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

class MyApp extends Application {
    public static GoogleAnalytics analytics;
    public static Tracker tracker;

    @Override
    public void onCreate() {
        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(100);

        tracker = analytics.newTracker("UA-63808886-1");
        tracker.enableExceptionReporting(true);
        tracker.enableAdvertisingIdCollection(true);
        tracker.enableAutoActivityTracking(true);

    }

}