package com.controller;

import com.service.Bank_service;

public class Bank_controller {
	public static void main(String[] args) {
		
		Bank_service be = new Bank_service();
		be.insertdata();
		
	}

}
