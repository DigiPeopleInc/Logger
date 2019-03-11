package ru.digipeople.logger

import kotlin.reflect.KClass

/**
 * Factory of [Logger].
 *
 * @author Aleksandr Brazhkin
 */
interface ILoggerFactory {
    fun getLogger(name: String): Logger

    fun getLogger(clazz: Class<*>): Logger

    fun getLogger(kClass: KClass<*>): Logger
}
