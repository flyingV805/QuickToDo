package kz.flyingv.quicktodo.notifications

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class ShowNotificationWorker(appContext: Context, workerParams: WorkerParameters): Worker(appContext, workerParams) {

    override fun doWork(): Result {
        return Result.success()
    }

}