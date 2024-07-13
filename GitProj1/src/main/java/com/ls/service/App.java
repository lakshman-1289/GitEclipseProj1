package com.ls.service;

public class App 
{
	public float sum(float x, float y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		App obj = new App();
		float res1 = obj.sum(50,-20);
		System.out.println(res1);
	}
}
