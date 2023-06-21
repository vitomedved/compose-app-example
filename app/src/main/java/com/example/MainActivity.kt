package com.example

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.common.model.ActivityResult
import com.example.designsystem.theme.PlaygroundTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class MainActivity : ComponentActivity() {

    private val activityResult = MutableStateFlow<ActivityResult?>(null)

    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                val collectedActivityResult by activityResult.collectAsStateWithLifecycle(initialValue = null)

                ExampleApp(
                    windowSizeClass = calculateWindowSizeClass(activity = this),
                    activityResult = collectedActivityResult
                )
            }
        }
    }

    // TODO use ActivityResult launchers
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        activityResult.update { ActivityResult(requestCode, resultCode, data) }
    }
}
