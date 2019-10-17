# KtInterceptor

## 使用高阶函数实现拦截器的一个例子

本文是对大飞哥的[Kotlin实战之Fuel的高阶函数](https://mp.weixin.qq.com/s/CPYAzy96Bs07RaCoEpYOfA)的简单实现

## 拦截器

通过高阶函数等特性实现的拦截器确实非常简洁优雅，测试用例在**src/test**目录下，代码如下：

```kotlin
 @Test
    fun interceptors_is_Correct() {
        Chain() // 构建责任链
            .add(interceptor = loggingRequestInterceptor()) // 添加日志拦截器
            .add(interceptor = tokenInterceptor()) // 添加 token 拦截器
            .start(request = Request()) // 具体请求
    }
```

