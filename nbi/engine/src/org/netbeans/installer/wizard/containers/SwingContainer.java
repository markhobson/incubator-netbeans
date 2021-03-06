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

package org.netbeans.installer.wizard.containers;

import org.netbeans.installer.utils.helper.swing.NbiButton;

/**
 * This is the specialization of the {@link WizardContainer} interface with regard 
 * to Swing UI mode - {@link UiMode#SWING}. It defines several methods which are
 * specific to the Swing-based containers.
 * 
 * @author Kirill Sorokin
 * @since 1.0
 */
public interface SwingContainer extends WizardContainer {
    /**
     * Returns the Swing implementation of the standard <code>Help</code> button.
     * 
     * @return <code>Help</code> button instance.
     */
    NbiButton getHelpButton();
    
    /**
     * Returns the Swing implementation of the standard <code>Back</code> button.
     * 
     * @return <code>Back</code> button instance.
     */
    NbiButton getBackButton();
    
    /**
     * Returns the Swing implementation of the standard <code>Next</code> button.
     * 
     * @return <code>Next</code> button instance.
     */
    NbiButton getNextButton();
    
    /**
     * Returns the Swing implementation of the standard <code>Cancel</code> button.
     * 
     * @return <code>Cancel</code> button instance.
     */
    NbiButton getCancelButton();
}
