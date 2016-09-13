package com.bm.insurance.comm.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2015/11/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-comm-mq.xml"})
public class MqTest {


    @Test
    public void ex(){
        Integer int1=new Integer(1);
        Integer int2=Integer.valueOf(1);
        int int3=1;
        Integer int4=new Integer(1);

        System.out.println(int1==int4);
        System.out.println(int1==int2);
        System.out.println(int2==int3);

        int i=3;
        double d=0.3,e=0.1;
        double dd=0.03,ee=0.001;
        System.out.println(d+","+e+";"+dd+";"+ee+";"+i*e+";"+i*ee+";"+0.01*0.02);
        System.out.println(i*e==d);
        System.out.println(i*ee==dd);
    }

    @Test
    public void test(){
        

    }


}
