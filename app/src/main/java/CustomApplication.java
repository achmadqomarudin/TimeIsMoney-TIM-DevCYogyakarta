/**
 * Created by sandypriyatna on 10/11/17.
 */

import com.firebase.client.Firebase;


public class CustomApplication extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
