package com.service;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.pojo.Main;
import com.pojo.Orders;

@Service("springMailSender")
public class SpringMailSender {

	@Autowired
	private SimpleMailMessage emailTemplate;

	@Autowired
	private JavaMailSenderImpl javaMailSender;

	public void setEmailTemplate(SimpleMailMessage emailTemplate) {
		this.emailTemplate = emailTemplate;
	}

	public void setJavaMailSender(JavaMailSenderImpl javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendMail(Orders order) {

		String fromEmail = emailTemplate.getFrom();
		String[] toEmail = emailTemplate.getTo();
		String emailSubject = emailTemplate.getSubject();
		String emailBody = String.format(emailTemplate.getText());

		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

			helper.setFrom(fromEmail);
			helper.setTo(toEmail);
			helper.setSubject(emailSubject);
			helper.setText(emailBody+"\n"+"address:"+order.getAddress()+"\n"+"order_id:"+order.getOrder_id()+"\n"+"product_id:"+order.getProduct_id()+"\n"+"quantity:"+order.getQuantity());

			javaMailSender.send(mimeMessage);
			System.out.println("Mail sent successfully.");
		} catch (MessagingException e) {
			e.printStackTrace();
		}

		final String username = "intesarahmed.md@techouts.com";
		final String password = "";

		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
		javax.mail.Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("intesarahmed.md@techouts.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(order.getEmail()));
			message.setSubject("OrderPlaced");
			message.setText("Thanks for shopping your order got placed\n" + "Your Order details:\n" + "Product_id:"
					+ order.getProduct_id() + " \n" +"Order_id:"+order.getOrder_id()+"\n"+ "Quantity:" + order.getQuantity() + " \n" + "Price:"
					+ order.getPrize() + " \n" + "SubTotal:" + order.getSubTotal() + "\n"
					+ "Please visit our site for tracking your order"

			);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}

}
