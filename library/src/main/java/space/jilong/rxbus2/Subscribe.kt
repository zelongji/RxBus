package space.jilong.rxbus2

/**
 * @author tomj
 *         Created  on 2017/02/07 17:54.
 *         Summary:
 */

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
@MustBeDocumented
annotation class Subscribe(val threadMode: ThreadMode = ThreadMode.MAIN)
