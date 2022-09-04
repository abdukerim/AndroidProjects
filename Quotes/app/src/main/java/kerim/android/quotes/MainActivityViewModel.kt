package kerim.android.quotes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.sql.DataSource

class MainActivityViewModel : ViewModel {

    private val quotes : MutableLiveData<List<Quote>> by lazy {
        MutableLiveData<List<Quote>>().also {
            loadQuotes()
        }
    }
    private void loadQuotes() {
        DataSource.loadQuotes()
    }
}