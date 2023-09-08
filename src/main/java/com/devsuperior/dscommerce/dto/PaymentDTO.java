package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Payment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
	private Long id;
	private Instant moment;
	public PaymentDTO(Payment entity) {
		id = entity.getId();
		moment = entity.getMoment();
	}
}
