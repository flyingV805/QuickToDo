package kz.flyingv.quicktodo

import android.app.Application
import androidx.room.Room
import kz.flyingv.quicktodo.repository.ToDoRepository
import kz.flyingv.quicktodo.repository.ToDoRepositoryImpl
import kz.flyingv.quicktodo.storage.AppStorage
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.dsl.module

class QuickToDoApp: Application() {

    private val appModule = module {
        single <ToDoRepository> { ToDoRepositoryImpl() }
        single { Room.databaseBuilder(androidContext(), AppStorage::class.java, "AppStorage.qtd").build()}
    }

    override fun onCreate() {
        super.onCreate()

        startKoin{
            //androidLogger()
            androidContext(this@QuickToDoApp)
            modules(appModule)
        }

    }

}