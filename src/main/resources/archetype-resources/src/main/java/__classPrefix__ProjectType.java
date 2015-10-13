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

import org.eclipse.che.api.project.server.type.ProjectType;
import org.eclipse.che.ide.Constants;

import com.google.inject.Singleton;

@Singleton
public class ${classPrefix}ProjectType extends ProjectType {

    public final static String ${classPrefix}_PROJECT_TYPE_ID = "${classPrefix}ProjectType";
    public final static String ${classPrefix}_PROJECT_TYPE_NAME = "${classPrefix} Project Type Name";
    public final static String ${classPrefix}_PROJECT_TYPE_CATEGORY = "${classPrefix} Project Type Category";
    public final static String PROGRAMMING_LANGUAGE = "java";

    public ${classPrefix}ProjectType() {
        super(${classPrefix}_PROJECT_TYPE_ID, ${classPrefix}_PROJECT_TYPE_NAME, true, false);
        addConstantDefinition(Constants.LANGUAGE, "language", PROGRAMMING_LANGUAGE);
    }
}
