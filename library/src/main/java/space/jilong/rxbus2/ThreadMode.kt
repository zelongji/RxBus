package space.jilong.rxbus2

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * @author tomj
 *         Created  on 2017/02/07 23:13.
 *         Summary:
 */
enum class ThreadMode {
  MAIN, IO, NEW, COMPUTE;
}

fun getScheduler(threadMode: ThreadMode): Scheduler {
  when (threadMode) {
    ThreadMode.MAIN -> return AndroidSchedulers.mainThread()
    ThreadMode.IO -> return Schedulers.io()
    ThreadMode.NEW -> return Schedulers.newThread()
    ThreadMode.COMPUTE -> return Schedulers.computation()
  }
}

