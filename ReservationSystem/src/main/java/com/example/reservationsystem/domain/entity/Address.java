package com.example.reservationsystem.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Address {
Hokkaido("北海道","北海道"),
Aomori("青森県","青森県");

	private String value;
	private String text;
	
}
