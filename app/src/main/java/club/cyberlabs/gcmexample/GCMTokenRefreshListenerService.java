package club.cyberlabs.gcmexample;


import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by HP on 08-05-2016.
 */
public class GCMTokenRefreshListenerService extends InstanceIDListenerService{
    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, GCMRegistrationIntentService.class);
        startService(intent);
    }
}
