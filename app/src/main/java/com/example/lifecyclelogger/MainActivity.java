package com.example.lifecyclelogger;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Activity Lifecycle Logger - משימה 1
 * 
 * המשימה שלכם: הוסיפו הודעות Log.d() לכל פונקציות מחזור החיים.
 * 
 * פונקציות שצריך להוסיף:
 * 1. onCreate() - כבר קיימת, רק צריך להוסיף Log
 * 2. onStart()
 * 3. onResume()
 * 4. onPause()
 * 5. onStop()
 * 6. onDestroy()
 * 
 * דוגמה להודעת Log:
 * Log.d("LifecycleDemo", "onCreate called");
 */
public class MainActivity extends AppCompatActivity {

    // TAG לשימוש ב-Log - השתמשו בזה בכל ההודעות
    private static final String TAG = "LifecycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // TODO: הוסיפו כאן הודעת Log.d() שאומרת שנקראה onCreate
        
    }

    // TODO: הוסיפו את הפונקציה onStart() עם הודעת Log
    

    // TODO: הוסיפו את הפונקציה onResume() עם הודעת Log
    

    // TODO: הוסיפו את הפונקציה onPause() עם הודעת Log
    

    // TODO: הוסיפו את הפונקציה onStop() עם הודעת Log
    

    // TODO: הוסיפו את הפונקציה onDestroy() עם הודעת Log
    
}
