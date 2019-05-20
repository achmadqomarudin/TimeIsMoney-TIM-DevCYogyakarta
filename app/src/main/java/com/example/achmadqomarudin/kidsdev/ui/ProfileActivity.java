package com.example.achmadqomarudin.kidsdev.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.achmadqomarudin.kidsdev.R;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.squareup.picasso.Picasso;

public class ProfileActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        String facebookUserId = "";
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        ImageView profilePicture = (ImageView) findViewById(R.id.image_profile_picture);

// find the Facebook profile and get the user's id
        for(UserInfo profile : user.getProviderData()) {
            // check if the provider id matches "facebook.com"
            if(FacebookAuthProvider.PROVIDER_ID.equals(profile.getProviderId())) {
                facebookUserId = profile.getUid();
            }
        }

// construct the URL to the profile picture, with a custom height
// alternatively, use '?type=small|medium|large' instead of ?height=
        String photoUrl = "https://graph.facebook.com/" + facebookUserId + "/picture?height=500";

// (optional) use Picasso to download and show to image
        Picasso.with(this).load(photoUrl).into(profilePicture);

    }

}