package ru.digipeople.logger;


/**
 * Factory of {@link Logger}.
 *
 * @author Aleksandr Brazhkin
 */
public class LoggerFactory {

    public static ILoggerFactory DEFAULT_FACTORY = new LogcatLoggerFactory();

    private LoggerFactory() {

    }

    public static Logger getLogger(String name) {
        return DEFAULT_FACTORY.getLogger(name);
    }

    public static Logger getLogger(Class<?> clazz) {
        return DEFAULT_FACTORY.getLogger(clazz);
    }
}
