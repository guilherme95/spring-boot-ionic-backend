package com.guilherme.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.guilherme.cursomc.domain.Pedido;

import javax.mail.internet.MimeMessage;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}
