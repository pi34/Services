package com.serviceapps.shopping.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.serviceapps.shopping.R

/**
 * Login Screen of the application.
 */
@Suppress("DEPRECATION")
class LoginActivity : AppCompatActivity() {

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_login)

        // TODO Step 1: Hide the status bar for the LoginActivity to make it full screen activity.
        // START
        // This is used to hide the status bar and make the login screen as a full screen activity.
        // It is deprecated in the API level 30. I will update you with the alternate solution soon.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
       // END

    }
}