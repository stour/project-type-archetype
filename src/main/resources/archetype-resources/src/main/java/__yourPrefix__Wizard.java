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

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.eclipse.che.api.project.shared.dto.ImportProject;
import org.eclipse.che.ide.api.project.type.wizard.ProjectWizardRegistrar;
import org.eclipse.che.ide.api.wizard.WizardPage;

import com.google.inject.Inject;
import com.google.inject.Provider;

import static ${package}.${yourPrefix}Attributes.${yourPrefix}_PROJECT_TYPE_CATEGORY;
import static ${package}.${yourPrefix}Attributes.${yourPrefix}_PROJECT_TYPE_ID;

/**
 * Provides information for registering sample project type into project wizard.
 */
public class ${yourPrefix}Wizard implements ProjectWizardRegistrar {
    private final List<Provider<? extends WizardPage<ImportProject>>> wizardPages;

    @Inject
    public ${yourPrefix}Wizard() {
        wizardPages = new ArrayList<>();
    }

    @NotNull
    public String getProjectTypeId() {
        return ${yourPrefix}_PROJECT_TYPE_ID;
    }

    @NotNull
    public String getCategory() {
        return ${yourPrefix}_PROJECT_TYPE_CATEGORY;
    }

    @NotNull
    public List<Provider<? extends WizardPage<ImportProject>>> getWizardPages() {
        return wizardPages;
    }
}
