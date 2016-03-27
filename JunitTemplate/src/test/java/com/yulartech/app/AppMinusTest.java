package com.yulartech.app;

import junit.framework.Assert;
import org.junit.Test;

public class AppMinusTest{

    App app = new App();

    @Test
    public void testMinus(){
        Assert.assertEquals(app.minus(9,7), 2);
    }

}

