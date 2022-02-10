package kz.flyingv.quicktodo.notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.core.content.ContextCompat.getSystemService
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import kz.flyingv.quicktodo.R
import java.util.concurrent.TimeUnit

class NotificationsManager {

    private val notificationChannelID = ""

    fun setNotificationForTime(){

    }

    private fun createWork(context: Context){
        val requestBuilder = OneTimeWorkRequestBuilder<ShowNotificationWorker>().setInitialDelay(20, TimeUnit.SECONDS)
        val data = Data.Builder()

        requestBuilder.setInputData(data.build())
        WorkManager.getInstance(context).enqueue(requestBuilder.build())
    }

    private fun createNotificationChannels(context: Context){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = context.getString(R.string.empty)
            val descriptionText = context.getString(R.string.empty)
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(notificationChannelID, name, importance).apply {
                description = descriptionText
            }
            // Register the channel with the system
            val notificationManager: NotificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

}