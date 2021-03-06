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

package org.netbeans.modules.maven.grammar;

import org.netbeans.modules.maven.indexer.api.PluginIndexManager;
import java.util.List;
import java.util.Set;
import org.netbeans.modules.maven.spi.grammar.GoalsProvider;
import java.util.Collections;
import java.util.HashSet;
import org.netbeans.modules.maven.embedder.EmbedderFactory;
import org.openide.util.Exceptions;
import org.openide.util.lookup.ServiceProvider;

@ServiceProvider(service=GoalsProvider.class)
public class GoalsProviderImpl implements GoalsProvider {
    
    @Override public Set<String> getAvailableGoals() {
        List<String> groups = EmbedderFactory.getProjectEmbedder().getSettings().getPluginGroups();
        Set<String> grps = new HashSet<String>(groups);
        grps.add("org.apache.maven.plugins"); //NOI18N
        grps.add("org.codehaus.mojo"); //NOI18N
        try {
            return PluginIndexManager.getPluginGoalNames(grps);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
        return Collections.<String>emptySet();
    }

}
