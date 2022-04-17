package com.franc.design._02_structural._10_pacade._01_before;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/** [메일발송] - 클라이언트 */
public class Client {
    public static void main(String[] args) {
        String to = "franc@naver.com";
        String from = "info@naver.com";
        String host = "127.0.0.1";

        // =================================
        // # 메일발송
        //   - 클라이언트가 필요한 모든 의존성을 받아 기능을 사용한다..
        //   - 클라이언트가 알아야될 부분도 많고... 처리해야 할 부분도 많다...
        // =================================

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Test Mail from Java Program");
            message.setText("message");

            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
