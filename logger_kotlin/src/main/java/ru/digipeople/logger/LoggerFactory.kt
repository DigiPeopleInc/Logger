package ru.digipeople.logger

import kotlin.reflect.KClass


/**
 * Factory of [Logger].
 *
 * @author Aleksandr Brazhkin
 */
object LoggerFactory {

    var DEFAULT_FACTORY: ILoggerFactory = LogcatLoggerFactory()

    @JvmStatic
    fun getLogger(name: String): Logger {
        return DEFAULT_FACTORY.getLogger(name)
    }

    @JvmStatic
    fun getLogger(clazz: Class<*>): Logger {
        return DEFAULT_FACTORY.getLogger(clazz)
    }

    @JvmStatic
    fun getLogger(kClass: KClass<*>): Logger {
        return DEFAULT_FACTORY.getLogger(kClass)
    }

}
