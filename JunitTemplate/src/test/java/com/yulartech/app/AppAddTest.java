package com.yulartech.app;

import junit.framework.Assert;
import org.junit.Test;

public class AppAddTest{

    App app = new App();

    @Test
    public void testAdd(){
	Assert.assertEquals(app.add(1,2), 3);
       
        Assert.assertEquals(app.add(5,6), 10);
    }

}
