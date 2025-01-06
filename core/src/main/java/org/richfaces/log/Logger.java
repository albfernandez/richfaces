/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.log;

/**
 * That interface hides current logging system from classes. Concrete implementation should provide appropriate logger instance
 * that delegates messages to the current log system.
 *
 * @author shura
 */
public interface Logger {
    public enum Level {
        DEBUG,
        INFO,
        WARNING,
        ERROR
    }

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     */
    boolean isDebugEnabled();

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     */
    void debug(CharSequence content);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void debug(Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     *
     */
    void debug(CharSequence content, Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void debug(Throwable error, Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void debug(Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    boolean isInfoEnabled();

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void info(CharSequence content);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void info(Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void info(CharSequence content, Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void info(Throwable error, Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void info(Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    boolean isWarnEnabled();

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void warn(CharSequence content);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void warn(Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void warn(CharSequence content, Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void warn(Throwable error, Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void warn(Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    boolean isErrorEnabled();

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void error(CharSequence content);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void error(Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void error(CharSequence content, Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void error(Throwable error, Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void error(Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    boolean isLogEnabled(Level level);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void log(Level level, CharSequence content);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void log(Level level, CharSequence content, Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void log(Level level, Throwable error);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void log(Level level, Enum<?> messageKey, Object... args);

    /**
     * <p class="changed_added_4_0">
     * </p>
     */
    void log(Level level, Throwable error, Enum<?> messageKey, Object... args);
}
