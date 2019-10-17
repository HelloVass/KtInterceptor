package info.hellovass.reactandroid

fun loggingRequestInterceptor(): Interceptor = { next: NextDispatcher ->
    { request: Request ->
        println("logger ==>>>")
        next(request)
    }
}

fun tokenInterceptor(): Interceptor = { next: NextDispatcher ->
    { request: Request ->
        println("token ==>>>")
        next(request)
    }
}