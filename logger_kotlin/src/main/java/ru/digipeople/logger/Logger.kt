package ru.digipeople.logger

/**
 * Logger.
 *
 * @author Aleksandr Brazhkin
 */
interface Logger {
    fun trace(msg: String)

    fun trace(msg: String, t: Throwable?)

    fun debug(msg: String)

    fun debug(msg: String, t: Throwable?)

    fun info(msg: String)

    fun info(msg: String, t: Throwable?)

    fun warn(msg: String)

    fun warn(msg: String, t: Throwable?)

    fun error(msg: String)

    fun error(msg: String, t: Throwable?)

    fun error(t: Throwable?)
}
