package ru.digipeople.logger;

/**
 * Default Logcat implementation of {@link ILoggerFactory}.
 *
 * @author Aleksandr Brazhkin
 */
public class LogcatLoggerFactory implements ILoggerFactory {
    @Override
    public Logger getLogger(String name) {
        return new LogcatLogger(name);
    }

    @Override
    public Logger getLogger(Class<?> clazz) {
        return new LogcatLogger(clazz.getSimpleName());
    }
}
