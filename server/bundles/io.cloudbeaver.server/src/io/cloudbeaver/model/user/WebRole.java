/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.cloudbeaver.model.user;

import org.jkiss.dbeaver.Log;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Web role.
 */
public class WebRole {

    private static final Log log = Log.getLog(WebRole.class);

    private String id;
    private String label;
    private String icon;
    private String description;

    private Set<String> permissions = new LinkedHashSet<>();

    public String getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    public Set<String> getPermissions() {
        return Collections.unmodifiableSet(permissions);
    }

    @Override
    public String toString() {
        return id;
    }
}
