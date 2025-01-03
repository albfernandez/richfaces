/**
 * License Agreement.
 * <p>
 * JBoss RichFaces - Ajax4jsf Component Library
 * <p>
 * Copyright (C) 2007  Exadel, Inc.
 * <p>
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 * <p>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.richfaces.event;

import jakarta.faces.event.FacesListener;

public interface DataScrollListener extends FacesListener {
    void processDataScroll(org.richfaces.event.DataScrollEvent event);
}
