# Logger
Logger implementation for Android

Usage
--------
```java
public class App extends Application {
    
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    @Override
    public void onCreate() {
        super.onCreate();
        logger.trace("trace");
        logger.error("error", new Throwable());
    }
}
```

Download
------------
###### Java
```groovy
dependencies {
    implementation 'ru.digipeople.logger:logger:1.0.0'
}
```
###### Kotlin
```groovy
dependencies {
    implementation 'ru.digipeople.logger:logger-kotlin:1.0.0'
}
```