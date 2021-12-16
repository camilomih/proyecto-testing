package com.cmih.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_multiple_times(){
        String resultado = StringUtil.repeat("hola",3);
        Assert.assertEquals( "hola hola hola", resultado);
    }

    @Test
    public void repeat_string_once_time() {
        String res = StringUtil.repeat("esternocleidomastoideo",1);
        Assert.assertEquals("esternocleidomastoideo",res);
    }

    @Test
    public void repeat_string_zero_times() {
        String res = StringUtil.repeat("esternocleidomastoideo",0);
        Assert.assertEquals("",res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }
}