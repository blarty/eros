/*
   Copyright 2006 Eros Project

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/


/**
 * Title:        Eros Logging Service<p>
 * Description:  Project to provide distributed system logging.<p>
 * Copyright:    Copyright (c) C. Lunn<p>
 * Company:      Countrywide Assured<p>
 * @author C. Lunn
 * @version 1.0
 */
package org.jini.projects.eros;

import java.rmi.Remote;
import java.rmi.RemoteException;
import net.jini.admin.Administrable;

/**
 * The service interface that should be used to locate an
 * Eros service as part of a lookup.
 */
public interface ErosService extends Remote, Administrable {

    /** 
     * Provides the logger object to the client which will provide all
     * logging functionality.
     * @throws RemoteException Any errors instantiating a logger for the request
     * @return The <code>ErosLogger</code> which should be used by the clietn
     */    
    ErosLogger getLogger() throws RemoteException;

    
}
