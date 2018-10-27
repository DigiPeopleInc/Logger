package ru.digipeople.logger

import android.util.Log

/**
 * Default Logcat implementation of [Logger].
 *
 * @author Aleksandr Brazhkin
 */
internal class LogcatLogger(name: String) : Logger {

    private val name = getEffectiveName(name)

    override fun trace(msg: String) {
        trace(msg, null)
    }

    override fun trace(msg: String, t: Throwable?) {
        val fullMessage = getMessageForLog(msg, t)
        Log.v(name, fullMessage)
    }

    override fun debug(msg: String) {
        debug(msg, null)
    }

    override fun debug(msg: String, t: Throwable?) {
        val fullMessage = getMessageForLog(msg, t)
        Log.d(name, fullMessage)
    }

    override fun info(msg: String) {
        info(msg, null)
    }

    override fun info(msg: String, t: Throwable?) {
        val fullMessage = getMessageForLog(msg, t)
        Log.i(name, fullMessage)
    }

    override fun warn(msg: String) {
        warn(msg, null)
    }

    override fun warn(msg: String, t: Throwable?) {
        val fullMessage = getMessageForLog(msg, t)
        Log.w(name, fullMessage)
    }

    override fun error(msg: String) {
        error(msg, null)
    }

    override fun error(msg: String, t: Throwable?) {
        val fullMessage = getMessageForLog(msg, t)
        Log.e(name, fullMessage)
    }

    override fun error(t: Throwable?) {
        error("", t)
    }

    private fun getEffectiveName(str: String): String {
        return if (str.length > MAX_LOG_TAG_LENGTH) {
            str.substring(0, MAX_LOG_TAG_LENGTH - 1)
        } else str
    }

    private fun getMessageForLog(message: String, throwable: Throwable?): String {
        var out = message
        if (throwable != null) {
            out = message + '\n' + Log.getStackTraceString(throwable)
        }
        return out
    }

    companion object {
        private const val MAX_LOG_TAG_LENGTH = 23
    }
}
