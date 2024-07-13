package com.ls.service;

public class App 
{
	public float sum(float x, float y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		App obj = new App();
		obj.sum(100,-50);
	}
}
