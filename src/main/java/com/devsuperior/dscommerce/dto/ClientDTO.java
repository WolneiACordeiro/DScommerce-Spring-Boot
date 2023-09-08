package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {
	private Long id;
	private String name;
	public ClientDTO(User entity) {
		id = entity.getId();
		name = entity.getName();
	}
}
