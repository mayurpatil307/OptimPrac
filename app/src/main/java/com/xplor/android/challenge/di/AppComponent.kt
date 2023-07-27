package com.xplor.android.challenge.di

import android.content.Context
import com.xplor.android.challenge.di.modules.DatabaseModule
import com.xplor.android.challenge.di.modules.NetworkModule
import com.xplor.android.challenge.di.modules.ViewModelModule
import com.xplor.android.challenge.ui.MainActivity
import com.xplor.android.challenge.ui.compose.ComposeActivity
import com.xplor.android.challenge.ui.xml.XmlListActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ViewModelModule::class,
        DatabaseModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: XmlListActivity)
    fun inject(activity: ComposeActivity)

}
