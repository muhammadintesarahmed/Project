package com.dao;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.pojo.Orders;


/*
 * @Repository public abstract class CartDAO1 implements CartDAO {
 * 
 * @Autowired(required = true) Session session;
 * 
 * public void setSession(Session session) { this.session = session; }
 * 
 * 
 * public void msg(Orders order) { final String username =
 * "intesarahmed.md@techouts.com"; final String password = "";
 * 
 * Properties props = new Properties(); props.put("mail.smtp.starttls.enable",
 * "true"); props.put("mail.smtp.auth", "true"); props.put("mail.smtp.host",
 * "smtp.gmail.com"); props.put("mail.smtp.port", "587"); javax.mail.Session
 * session = Session.getInstance(props, new javax.mail.Authenticator() {
 * protected PasswordAuthentication getPasswordAuthentication() { return new
 * PasswordAuthentication(username, password); } });
 * 
 * try {
 * 
 * Message message = new MimeMessage(session); message.setFrom(new
 * InternetAddress("intesarahmed.md@techouts.com"));
 * message.setRecipients(Message.RecipientType.TO,
 * InternetAddress.parse(order.getEmail())); message.setSubject("OrderPlaced");
 * message.setText("Thanks for shopping your order got placed" +"Product_id:"+
 * order.getProduct_id() + " " +"Quantity:"+order.getQuantity() + " " +"Price:"+
 * order.getPrize()
 * 
 * );
 * 
 * Transport.send(message);
 * 
 * System.out.println("Done");
 * 
 * } catch (MessagingException e) { throw new RuntimeException(e); } } }
 */