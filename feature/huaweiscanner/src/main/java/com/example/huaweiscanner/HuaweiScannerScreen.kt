package com.example.huaweiscanner

import android.app.Activity
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.common.model.ActivityResult
import com.huawei.hms.hmsscankit.ScanUtil
import com.huawei.hms.ml.scan.HmsScan
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions

@Composable
fun HuaweiScannerScreen(activityResult: ActivityResult?) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Huawei scanner screen")

        val activity = LocalContext.current as Activity
        LaunchedEffect(Unit) {
            val options = HmsScanAnalyzerOptions
                .Creator()
                .setHmsScanTypes(HmsScan.QRCODE_SCAN_TYPE)
                .setViewType(1)
                .setErrorCheck(true)
                .create()
            ScanUtil.startScan(activity, 12, options)
        }

        LaunchedEffect(activityResult) {
            if (activityResult != null) {
                // TODO fix deprecation
                val result = activityResult.data?.getParcelableExtra(ScanUtil.RESULT) as HmsScan?
                Log.d("HuaweiScannerScreen", "Scanned QR code: ${result?.getOriginalValue()}")
            }
        }
    }
}
