package com.example.common.model

import android.content.Intent

data class ActivityResult(val requestCode: Int, val resultCode: Int, val data: Intent?)
