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
package org.blarty.eros.exception;

/**
 * Class that utilises the exception class to provide some information
 * about where the call to log was generated if no exception is supplied
 * to the logging call.
 * <p>
 * This is not a true exception, but utilises the Exception properties to 
 * obtain the location of the logging.
 */
public class RuntimeInfo extends Exception {

    public RuntimeInfo() {
        super("Runtime Info");
    }

    public RuntimeInfo(String message) {
        super(message);
    }
}
