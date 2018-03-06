/*******************************************************************************
 *Licensed Materials - Property of IBM
 *(c) Copyright IBM Corporation 2008. All Rights Reserved.
 *
 *Note to U.S. Government Users Restricted Rights:  
 *Use, duplication or disclosure restricted by GSA ADP Schedule 
 *Contract with IBM Corp. 
 *
 *******************************************************************************/
package hello.test;

import junit.framework.TestCase;
import hello.Hello;

public class HelloTest extends TestCase {
    public void testGetMessage() {
        Hello hello = new Hello();
        assertEquals("Hello", hello.getMessage());
    }
}