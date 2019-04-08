package vt.com.pushnotificationfirebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseInstantService extends FirebaseInstanceIdService {
    private static final  String TAG = "FirebaseInstantService";


    @Override
    public void onTokenRefresh() {


        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

       // sendRegistrationToServer(refreshedToken);
    }
}
