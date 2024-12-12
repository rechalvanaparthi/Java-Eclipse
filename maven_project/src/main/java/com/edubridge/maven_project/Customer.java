package com.edubridge.maven_project;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter


public class Customer {
	private int customerId;
	private String customerName;
	private double customerSalary;
}
