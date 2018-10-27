package ru.digipeople.logger;


/**
 * Factory of {@link Logger}.
 *
 * @author Aleksandr Brazhkin
 */
public class LoggerFactory {
    public static Logger getLogger(String name) {
        return new LogcatLogger(name);
    }

    public static Logger getLogger(Class<?> clazz) {
        return getLogger(clazz.getSimpleName());
    }
}
