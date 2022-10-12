package com.project.demo.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UsersDto {

	private Long id;
	private String name;
	private String address;
}
