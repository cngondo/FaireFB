package firebase.example.com.fairefb;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by ngondo on 9/6/16.
 */

public class Constants {
    public static final String TAG = "AUTHENTICATED";
    public static final DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
}
