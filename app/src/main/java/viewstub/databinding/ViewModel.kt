package viewstub.databinding

import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.lifecycle.MutableLiveData

class ViewModel {
    val state = MutableLiveData<State>().apply { value = State.Error }
    val retryClickListener = View.OnClickListener { loadData() }
    private var counter: Int = 0

    init {
        loadData()
    }

    fun loadData() {
        state.value = State.Loading
        Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    when (counter) {
                        0 -> state.value = State.Error
                        1 -> state.value = State.Empty
                        else -> state.value = State.Done
                    }
                    counter++
                }, 1000
            )
    }

    enum class State {
         Loading,
         Empty ,
         Done ,
         Error
    }
}