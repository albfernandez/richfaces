/**
 * License Agreement.
 * <p>
 * Rich Faces - Natural Ajax for Java Server Faces (JSF)
 * <p>
 * Copyright (C) 2007 Exadel, Inc.
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
package org.ajax4jsf.component;

import java.util.Iterator;

import javax.faces.component.UIComponent;

import org.richfaces.model.DataComponentState;
import org.richfaces.model.ExtendedDataModel;
import org.ajax4jsf.tests.MockComponentState;
import org.ajax4jsf.tests.MockDataModel;

/**
 * @author shura
 *
 */
public class MockDataAdaptor extends UIDataAdaptor {
    /*
     *  (non-Javadoc)
     * @see org.ajax4jsf.ajax.repeat.UIDataAdaptor#createComponentState()
     */
    protected DataComponentState createComponentState() {

        // TODO Auto-generated method stub
        return new MockComponentState();
    }

    /*
     *  (non-Javadoc)
     * @see org.ajax4jsf.ajax.repeat.UIDataAdaptor#createDataModel()
     */
    protected ExtendedDataModel createDataModel() {

        // TODO Auto-generated method stub
        return new MockDataModel();
    }

    /*
     *  (non-Javadoc)
     * @see org.ajax4jsf.ajax.repeat.UIDataAdaptor#dataChildren()
     */
    protected Iterator<UIComponent> dataChildren() {

        // TODO Auto-generated method stub
        return getChildren().iterator();
    }

    /*
     *  (non-Javadoc)
     * @see org.ajax4jsf.ajax.repeat.UIDataAdaptor#fixedChildren()
     */
    protected Iterator<UIComponent> fixedChildren() {

        // TODO Auto-generated method stub
        return getFacets().values().iterator();
    }
}
