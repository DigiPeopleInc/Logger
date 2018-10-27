package ru.digipeople.logger

import kotlin.reflect.KClass


/**
 * Factory of [Logger].
 *
 * @author Aleksandr Brazhkin
 */
object LoggerFactory {
    @JvmStatic
    fun getLogger(name: String): Logger {
        return LogcatLogger(name)
    }

    @JvmStatic
    fun getLogger(clazz: Class<*>): Logger {
        return getLogger(clazz.simpleName)
    }

    fun getLogger(kClass: KClass<*>): Logger {
        return getLogger(kClass.java)
    }
}
