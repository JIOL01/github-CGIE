package com.appnica.cursosexcel

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

object IntentManager {

    fun navigateToUrl(activity: Activity, url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        activity.startActivity(intent)
    }

    fun noData(context: Context, messageData: String) {
        Toast.makeText(context, messageData, Toast.LENGTH_SHORT).show()
    }

}