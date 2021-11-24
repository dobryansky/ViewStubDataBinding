package viewstub.databinding

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingConversion
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import viewstub.databinding.databinding.ActivityMainBinding



@BindingConversion
fun fromBool(isVisible: Boolean): Int {
    return if (isVisible) View.VISIBLE else View.GONE
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.viewModel = ViewModel()
        binding.lifecycleOwner = this
    }
}

