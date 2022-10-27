package main.java.design.pattern.Prototype_Pattern.v1;

import java.util.Random;

public class Client {
    //发送账单的数量，值从数据库中获得
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        //模拟发送邮件
        int i = 0;

        //定义模板，理论是从数据库中获得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("scy银行controller");
        while(i < MAX_COUNT){
            //每封邮件不同的地方
            mail.setAppellation(getRandString(5) + "先生(女士)");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8)+".com");
            //然后发送邮件
            sendMail(mail);
            i++;
        }
    }


    //发送邮件
    public static void sendMail(Mail mail){
        System.out.println("标题" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t。。。发送成功");
    }

    //获取指定长度的字符串
    public static String getRandString(int maxLength){
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < maxLength; i++){
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }
}
