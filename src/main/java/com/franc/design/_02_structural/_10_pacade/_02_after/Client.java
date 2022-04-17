package com.franc.design._02_structural._10_pacade._02_after;

/** [메일발송] - 클라이언트 */
public class Client {
    public static void main(String[] args) {

        // #1. 이메일 설정정보 셋팅
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        // #2. 이메일 정보 셋팅
        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("franc@naver.com");
        emailMessage.setTo("shopping_info@naver.com");
        emailMessage.setCc("참조@naver.com");
        emailMessage.setSubject("네이버 쇼핑 배송이 안와요ㅠㅠ");
        emailMessage.setText("언제오나요??");

        // #3. 메일 발송
        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);
    }
}
