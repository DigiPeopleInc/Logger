package ru.digipeople.logger

import kotlin.reflect.KClass

/**
 * Default Logcat implementation of [LoggerFactory].
 *
 * @author Aleksandr Brazhkin
 */
class LogcatLoggerFactory : ILoggerFactory {
    override fun getLogger(name: String): Logger {
        return LogcatLogger(name)
    }

    override fun getLogger(clazz: Class<*>): Logger {
        return LogcatLogger(clazz.simpleName)
    }

    override fun getLogger(kClass: KClass<*>): Logger {
        return LogcatLogger(kClass.java.simpleName)
    }
}
