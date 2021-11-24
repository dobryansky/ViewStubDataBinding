package viewstub.databinding

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.lifecycle.MutableLiveData

class ViewModel {
    val state = MutableLiveData<State>().apply { value = State.Error }

    enum class State {
         Empty ,
         Done ,
         Error
    }
}