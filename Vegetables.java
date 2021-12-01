package com.technoelevate.grocery.add.cart;

public class Vegetables {
	public String tomato;
	public String onions;
	public String potatos;
	public String brinjal;
	public String ginger;

	public Vegetables(String tomato, String onions, String potatos, String brinjal, String ginger) {
		super();
		this.tomato = tomato;
		this.onions = onions;
		this.potatos = potatos;
		this.brinjal = brinjal;
		this.ginger = ginger;
	}

	public void vegetables() {
		System.out.println("vegetables() method called ");
	}

}
