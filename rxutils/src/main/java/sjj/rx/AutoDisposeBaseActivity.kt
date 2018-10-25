package sjj.rx

import android.support.v7.app.AppCompatActivity
import io.reactivex.disposables.Disposable

open class AutoDisposeBaseActivity : AppCompatActivity() {
    fun Disposable.destroy(onceKey: String? = null) {
        destroy(onceKey, lifecycle)
    }

    fun Disposable.stop(onceKey: String? = null) {
        stop(onceKey, lifecycle)
    }

    fun Disposable.pause(onceKey: String? = null) {
        pause(onceKey, lifecycle)
    }
}