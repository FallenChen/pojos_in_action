/*
 * Copyright (c) 2005 Chris Richardson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package net.chrisrichardson.util.spring;

import org.springframework.context.*;
import org.springframework.test.*;

/**
 * Extends AbstractDependencyInjectionSpringContextTests and adds support for application 
 * context access via ContextSingletonBeanFactoryLocator
 * 
 * Subclasses must override either getConfigLocations() or 
 * getParentSelector()/getParentFactoryKey()
 * @author cer
 *
 */
public abstract class AbstractDependencyInjectionSpringContextWithParentTests
		extends AbstractDependencyInjectionSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		return null;
	}

	@Override
	protected ConfigurableApplicationContext getContext(Object key) {
		ApplicationContext parent = getParentApplicationContext();
		if (parent == null) {
			assertNotNull("key", key);
			return super.getContext(key);
		} else
			return (ConfigurableApplicationContext) parent;
	}

	protected ConfigurableApplicationContext loadContextLocations(
			String[] locations) {
		ApplicationContext parent = getParentApplicationContext();
		if (parent != null)
			throw new RuntimeException("never here");
		else
			return super.loadContextLocations(locations);
	}

	protected ApplicationContext getParentApplicationContext() {
		String selector = getParentSelector();
		String factoryKey = getParentFactoryKey();
		if (selector != null && factoryKey != null)
			return TheBeanFactory.getApplicationContext(selector, factoryKey);
		return null;
	}

	protected String getParentSelector() {
		return null;
	}

	protected String getParentFactoryKey() {
		return null;
	}

}
