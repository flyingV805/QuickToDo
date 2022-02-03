package kz.flyingv.quicktodo.notifications

import android.content.Context
import androidx.work.Data
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class NotificationsManager {

    fun setNotificationForTime(){

    }

    private fun createWork(context: Context){
        val requestBuilder = OneTimeWorkRequestBuilder<CheckNotificationWorker>().setInitialDelay(20, TimeUnit.SECONDS)
        val data = Data.Builder()

        requestBuilder.setInputData(data.build())
        WorkManager.getInstance(context).enqueue(requestBuilder.build())
    }

}