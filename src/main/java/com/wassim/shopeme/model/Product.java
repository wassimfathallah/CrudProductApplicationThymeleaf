package com.wassim.shopeme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;

	public Product(String marque, String color, String img, String name, double price, int qte) {
		super();
		this.marque = marque;
		this.color = color;
		this.img = img;
		this.name = name;
		this.price = price;
		this.qte = qte;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	private String color;
	private String img;
	private String name;
	private double price;
	private int qte;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, double price, int qte) {
		super();
		this.name = name;
		this.price = price;
		this.qte = qte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

}
