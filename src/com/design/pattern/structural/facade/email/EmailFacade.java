package com.design.pattern.structural.facade.email;

import com.design.pattern.structural.facade.Order;
import com.design.pattern.structural.facade.email.Template.TemplateType;

public class EmailFacade {

	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationFactory.creatStationary();
		Email email = Email.getBuilder().withTemplate(template).withStationary(stationary).forObject(order).build();

		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);

	}

}
