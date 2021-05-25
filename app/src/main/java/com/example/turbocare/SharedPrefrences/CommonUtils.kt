package com.example.turbocare.SharedPrefrences

import android.app.Activity
import android.app.ActivityManager
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.Uri
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import com.example.turbocare.R

class CommonUtils {
    companion object {
        private var progressDialog: ProgressDialog? = null

        fun isNetworkConnected(context: Context): Boolean {
            val cm =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            return cm.activeNetworkInfo != null
        }


        fun showProgress(activity: Activity?, message: String?) {
            progressDialog = ProgressDialog(activity, R.style.DialogStyle)
            progressDialog!!.setMessage(message)
            progressDialog!!.setCanceledOnTouchOutside(false)
            progressDialog!!.show()
        }

        fun dismissProgress() {
            if (progressDialog != null && progressDialog!!.isShowing) {
                progressDialog!!.dismiss()
            }
        }

    }
}