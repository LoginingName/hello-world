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
        //mqService.sendTextMsg("hello world!");

        /*EmailMsg emailMsg = new EmailMsg();
        emailMsg.setSubject("豆包网注册");
        String[] to = new String[]{"ruimin.zhang@baodanyun-inc.com"};
        String[] cc = new String[]{"puguang.yang@baodanyun-inc.com"};
        String[] bcc = new String[]{"18310116761@qq.com"};

        emailMsg.setTo(to);
        emailMsg.setCc(cc);
        emailMsg.setBcc(bcc);

        emailMsg.setContent("MQ测试邮件");


        mqService.sendObjMsg(emailMsg);*/

        /*EmailMsg emailMsg = new EmailMsg();
        emailMsg.setId(367);
        mqService.sendObjMsg(emailMsg);*/


        /*SmsMsg smsMsg = new SmsMsg();
        smsMsg.setMobile("18310116761");
        smsMsg.setContent("MQ测试短信");
        mqService.sendObjMsg(smsMsg);*/

        /*SmsMsg smsMsg = new SmsMsg();
        smsMsg.setId(365);
        mqService.sendObjMsg(smsMsg);*/

        //oAH_qsqNIkpSSQ0m3mUJUQwt8rUU普光
        //oAH_qshkKs9l1klRASDOU1CVnj3s张锐敏
        //oAH_qslSfiAiaRXBAHzw3e64k93g吴峥桂
        //oAH_qsm6yPTi8I3hv_03mq4lCMKk于涛

       /* String toUser = "oAH_qshkKs9l1klRASDOU1CVnj3s";

        WeChatMsg weChatMsg = new WeChatMsg();
        weChatMsg.setToUser(toUser);

        SysWarnTpl warnMsg = new SysWarnTpl();
        warnMsg.setTouser(toUser);
        //warnMsg.setUrl("http://weixin.qq.com/download");

        warnMsg.setFirst("请注意豆包网系统报警内容");
        warnMsg.setKeyword1("用户子系统");
        warnMsg.setKeyword2(DateUtils.getNowTime());
        warnMsg.setKeyword3("高");
        warnMsg.setRemark("新用户创建失败");


        weChatMsg.setContent(warnMsg.toJson());

        mqService.sendObjMsg(weChatMsg);*/

        /*WeChatMsg weChatMsg = new WeChatMsg();
        weChatMsg.setId(371);
        mqService.sendObjMsg(weChatMsg);*/

    }


}
