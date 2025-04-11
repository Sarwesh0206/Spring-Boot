package com.csc.paymentservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendPaymentSuccessEmail(String toEmail, String studentName, Double amount) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Payment Successful");
        message.setText("Dear " + studentName + ",\n\nYour payment of " + amount + " was successful.\n\nThank you for your payment!");

        mailSender.send(message);
    }
}
