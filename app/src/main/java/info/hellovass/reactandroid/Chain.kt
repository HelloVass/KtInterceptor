package info.hellovass.reactandroid

class Chain(
    private val interceptors: MutableList<Interceptor> = mutableListOf()
) {

    // 添加拦截器
    fun add(interceptor: Interceptor) = apply {
        interceptors += interceptor
    }

    // 开始
    fun start(request: Request) {
        val dispatcher = interceptors.foldRight(
            initial = { r: Request -> r },
            operation = { func, acc ->
                func(acc)
            })
        dispatcher(request)
    }
}