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
package org.richfaces.resource;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author Nick Belaevski
 * @since 4.0
 */
public class ResourceHandlerImplTest {
    protected static final String ECHO_HEADER = "RichFaces-Echo";
    protected static final Date currentTime;
    protected static final Date expires;
    protected static final Date lastModified;
    private static final String IF_MODIFIED_SINCE = "If-Modified-Since";
    private static final String RESOURCES_FOLDER_PATH = "resources/";
    private static final String TEST_RESOURCE_NAME = RESOURCES_FOLDER_PATH + "defaultResourceHandlerResource.js";

    static {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

        currentTime = calendar.getTime();
        calendar.add(Calendar.DATE, -1);
        lastModified = calendar.getTime();
        calendar.add(Calendar.DATE, 15);
        expires = calendar.getTime();
    }
}
