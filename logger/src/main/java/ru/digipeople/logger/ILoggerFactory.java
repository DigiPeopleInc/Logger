package ru.digipeople.logger;

/**
 * Factory of {@link Logger}.
 *
 * @author Aleksandr Brazhkin
 */
public interface ILoggerFactory {
    Logger getLogger(String name);

    Logger getLogger(Class<?> clazz);
}
