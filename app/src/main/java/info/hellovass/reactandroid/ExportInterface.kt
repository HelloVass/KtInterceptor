package info.hellovass.reactandroid

typealias NextDispatcher = (request: Request) -> Request

typealias Interceptor = (dispatcher: NextDispatcher) -> NextDispatcher