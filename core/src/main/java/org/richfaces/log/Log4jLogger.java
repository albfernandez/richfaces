package org.richfaces.log;

import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

import org.richfaces.l10n.BundleLoader;
import org.richfaces.l10n.InterpolationException;
import org.richfaces.l10n.MessageInterpolator;

public class Log4jLogger implements Logger {
    public static final String RICHFACES_LOG = "org.richfaces";

    static final Map<Level, org.apache.log4j.Level> LEVELS_MAP = new EnumMap<>(Level.class);
    static {
        LEVELS_MAP.put(Level.ERROR, org.apache.log4j.Level.ERROR);
        LEVELS_MAP.put(Level.INFO, org.apache.log4j.Level.INFO);
        LEVELS_MAP.put(Level.WARNING, org.apache.log4j.Level.WARN);
        LEVELS_MAP.put(Level.DEBUG, org.apache.log4j.Level.DEBUG);
    }

    private org.apache.log4j.Logger log;
    private MessageInterpolator messageInterpolator;

    Log4jLogger() {
        this(RICHFACES_LOG);
    }

    Log4jLogger(String category) {
        log = org.apache.log4j.Logger.getLogger(category);
        messageInterpolator = new MessageInterpolator(new BundleLoader());
    }

    @Override
    public boolean isDebugEnabled() {
        return log.isDebugEnabled();
    }

    @Override
    public void debug(CharSequence content) {
        log.debug(content);
    }

    @Override
    public void debug(Enum<?> messageKey, Object... args) {
        if (log.isDebugEnabled()) {
            log.debug(interpolate(messageKey, args));
        }
    }

    @Override
    public void debug(CharSequence content, Throwable error) {
        log.debug(content, error);
    }

    @Override
    public void debug(Throwable error, Enum<?> messageKey, Object... args) {
        if (log.isDebugEnabled()) {
            log.debug(interpolate(messageKey, args), error);
        }
    }

    @Override
    public void debug(Throwable error) {
        log.debug(error.getMessage(), error);
    }

    @Override
    public boolean isInfoEnabled() {
        return log.isInfoEnabled();
    }

    @Override
    public void info(CharSequence content) {
        log.info(content);
    }

    @Override
    public void info(Enum<?> messageKey, Object... args) {
        if (log.isInfoEnabled()) {
            log.info(interpolate(messageKey, args));
        }

    }

    @Override
    public void info(CharSequence content, Throwable error) {
        log.info(content, error);
    }

    @Override
    public void info(Throwable error, Enum<?> messageKey, Object... args) {
        if (log.isInfoEnabled()) {
            log.info(interpolate(messageKey, args), error);
        }
    }

    @Override
    public void info(Throwable error) {
        log.info(error.getMessage(), error);
    }

    @Override
    public boolean isWarnEnabled() {
        return log.isEnabledFor(org.apache.log4j.Level.WARN);
    }

    @Override
    public void warn(CharSequence content) {
        log.warn(content);
    }

    @Override
    public void warn(Enum<?> messageKey, Object... args) {
        if (isWarnEnabled()) {
            log.warn(interpolate(messageKey, args));
        }
    }

    @Override
    public void warn(CharSequence content, Throwable error) {
        log.warn(content, error);
    }

    @Override
    public void warn(Throwable error, Enum<?> messageKey, Object... args) {
        if (isWarnEnabled()) {
            log.warn(interpolate(messageKey, args), error);
        }
    }

    @Override
    public void warn(Throwable error) {
        log.warn(error.getMessage(), error);
    }

    @Override
    public boolean isErrorEnabled() {
        return log.isEnabledFor(org.apache.log4j.Level.ERROR);
    }

    @Override
    public void error(CharSequence content) {
        log.error(content);
    }

    @Override
    public void error(Enum<?> messageKey, Object... args) {
        if (isErrorEnabled()) {
            log.error(interpolate(messageKey, args));
        }
    }

    @Override
    public void error(CharSequence content, Throwable error) {
        log.error(content, error);
    }

    @Override
    public void error(Throwable error, Enum<?> messageKey, Object... args) {
        if (isErrorEnabled()) {
            log.error(interpolate(messageKey, args), error);
        }
    }

    @Override
    public void error(Throwable error) {
        log.error(error.getMessage(), error);

    }

    @Override
    public boolean isLogEnabled(Level level) {
        return log.isEnabledFor(LEVELS_MAP.get(level));
    }

    @Override
    public void log(Level level, CharSequence content) {
        log.log(LEVELS_MAP.get(level), content);

    }

    @Override
    public void log(Level level, CharSequence content, Throwable error) {
        log.log(LEVELS_MAP.get(level), content, error);
    }

    @Override
    public void log(Level level, Throwable error) {
        log.log(LEVELS_MAP.get(level), error.getMessage(), error);
    }

    @Override
    public void log(Level level, Enum<?> messageKey, Object... args) {
        if (isLogEnabled(level)) {
            log.log(LEVELS_MAP.get(level), interpolate(messageKey, args));
        }
    }

    @Override
    public void log(Level level, Throwable error, Enum<?> messageKey, Object... args) {
        if (isLogEnabled(level)) {
            log.log(LEVELS_MAP.get(level), interpolate(messageKey, args), error);
        }
    }

    private String interpolate(Enum<?> messageKey, Object... args) {
        try {
            return messageInterpolator.interpolate(Locale.getDefault(), messageKey, args);
        } catch (InterpolationException e) {
            return "???" + e.getMessageKey() + "???";
        }
    }

}
