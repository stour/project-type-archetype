#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package ${package};

import org.eclipse.che.ide.api.extension.Extension;
import org.eclipse.che.ide.api.icon.Icon;
import org.eclipse.che.ide.api.icon.IconRegistry;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import static ${package}.${yourPrefix}Attributes.${yourPrefix}_PROJECT_TYPE_CATEGORY;

@Singleton
@Extension(title = "${yourPrefix} Project Type Extension", version = "1.0.0")
public class ${yourPrefix}Extension {

    @Inject
    public ${yourPrefix}Extension(${yourPrefix}Resources resources, IconRegistry iconRegistry) {
        iconRegistry.registerIcon(new Icon(${yourPrefix}_PROJECT_TYPE_CATEGORY + ".samples.category.icon",
                resources.${yourPrefix}ProjectTypeIcon()));
    }
}
