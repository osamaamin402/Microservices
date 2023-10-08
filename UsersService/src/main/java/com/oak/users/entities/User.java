package com.oak.users.entities;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	@Id
	@Column(name = "ID")
	@NotBlank(message = "userId is mandatory")
	@NotNull(message = "userId is mandatory")
	private String userId;

	@Column(name = "NAME", length = 20)
	@NotBlank(message = "name is mandatory")
	@NotNull(message = "name is mandatory")
	private String name;

	@Column(name = "EMAIL")
	@NotBlank(message = "email is mandatory")
	@NotNull(message = "email is mandatory")
	private String email;
	
	@Column(name = "ABOUT")
	@NotBlank(message = "about is mandatory")
	@NotNull(message = "about is mandatory")
	private String about;
	// other user properties that you want

	@Transient
	private List<Rating> ratings = new ArrayList<>();
}
