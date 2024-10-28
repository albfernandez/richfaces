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
package org.richfaces.cdi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.security.cert.Extension;

import org.richfaces.cdi.push.producer.TopicsContextProducer;

import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.BeforeBeanDiscovery;

/**
 * Registers all necessary beans required by {@link PushCDIExtension} extension.
 *
 * @author <a href="http://community.jboss.org/people/lfryc">Lukas Fryc</a>
 */
public class PushCDIDependencyRegistrationExtension implements Extension {

    /**
     * Registers all necessary beans required by {@link PushCDIExtension} extension.
     */
    public void beforeBeanDiscovery(@Observes BeforeBeanDiscovery bbd, BeanManager beanManager) {
        bbd.addAnnotatedType(beanManager.createAnnotatedType(Push.class), "Push");
        bbd.addAnnotatedType(beanManager.createAnnotatedType(TopicKeyResolver.class),"TopicKeyResolver");
        bbd.addAnnotatedType(beanManager.createAnnotatedType(TopicsContextProducer.class), "TopicsContextProducer");
    }

    //MZ
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	//MZ
	@Override
	public boolean isCritical() {
		// TODO Auto-generated method stub
		return false;
	}

	//MZ
	@Override
	public byte[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	//MZ
	@Override
	public void encode(OutputStream out) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
