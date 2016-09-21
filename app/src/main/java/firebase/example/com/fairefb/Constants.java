package firebase.example.com.fairefb;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Constants {
    public static final String TAG = "AUTHENTICATED";
    public static final DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
}
