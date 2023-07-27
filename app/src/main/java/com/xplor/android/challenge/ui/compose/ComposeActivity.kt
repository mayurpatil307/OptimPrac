package com.xplor.android.challenge.ui.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.Text
import androidx.lifecycle.ViewModelProvider
import com.xplor.android.challenge.App
import com.xplor.android.challenge.ui.MainViewModel
import javax.inject.Inject

class ComposeActivity : ComponentActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel: MainViewModel by viewModels { viewModelFactory }

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)

        setContent {
            Text(text = "Hello World from compose")
        }

    }

}
