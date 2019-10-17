package info.hellovass.reactandroid

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun interceptors_is_Correct() {
        Chain()
            .add(interceptor = loggingRequestInterceptor())
            .add(interceptor = tokenInterceptor())
            .start(request = Request())
    }
}
