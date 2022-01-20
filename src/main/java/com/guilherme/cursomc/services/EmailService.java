package com.guilherme.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.guilherme.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderCOnfirmationEmail(Pedido obj);
	void sendEmail(SimpleMailMessage msg);
}
