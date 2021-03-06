/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.maven.model.pom.impl;

import org.netbeans.modules.maven.model.pom.*;
import org.w3c.dom.Element;

/**
 *
 * @author mkleint
 */
public class PrerequisitesImpl extends POMComponentImpl implements Prerequisites {

    public PrerequisitesImpl(POMModel model, Element element) {
        super(model, element);
    }
    
    public PrerequisitesImpl(POMModel model) {
        this(model, createElementNS(model, model.getPOMQNames().PREREQUISITES));
    }

    // attributes

    // child elements
    @Override
    public void accept(POMComponentVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getMaven() {
        return getChildElementText(getModel().getPOMQNames().MAVEN.getQName());
    }

    @Override
    public void setMaven(String maven) {
        setChildElementText(getModel().getPOMQNames().MAVEN.getName(), maven,
                getModel().getPOMQNames().MAVEN.getQName());
    }

}
