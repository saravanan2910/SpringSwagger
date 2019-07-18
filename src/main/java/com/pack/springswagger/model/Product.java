package com.pack.springswagger.model;

import java.io.Serializable;

import javax.xml.bind.annotation.*;

import lombok.Data;


@SuppressWarnings("serial")
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable{
	
	private int id;
	private String name;
	private double price;
}
