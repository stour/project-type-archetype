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

@Singleton
@Extension(title = "${classPrefix} Project Type Extension", version = "1.0.0")
public class ${classPrefix}Extension {

    public final static String ${classPrefix}_PROJECT_TYPE_ID = "${classPrefix}ProjectType";
    public final static String ${classPrefix}_PROJECT_TYPE_NAME = "${classPrefix} Project Type Name";
    public final static String ${classPrefix}_PROJECT_TYPE_CATEGORY = "${classPrefix} Project Type Category";
    public final static String PROGRAMMING_LANGUAGE = "java";

    @Inject
    public ${classPrefix}Extension(${classPrefix}Resources resources, IconRegistry iconRegistry) {
        iconRegistry.registerIcon(new Icon(${classPrefix}_PROJECT_TYPE_CATEGORY + ".samples.category.icon",
                resources.${classPrefix}ProjectTypeIcon()));
    }
}
