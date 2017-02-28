/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;

/**
 *
 * @author MAZI_
 */
public class StartupRunner implements CommandLineRunner {

    protected final Log logger = LogFactory.getLog(getClass());
    
    @Override
    public void run(String... strings) throws Exception {
        logger.info("Hello");
    }
    
}
