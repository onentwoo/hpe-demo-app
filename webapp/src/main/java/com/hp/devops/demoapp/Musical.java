package com.hp.devops.demoapp;

public class Musical {
	public int id;
	public String name = "tom               exception";
	public int age;
	public int type1;
    public int type15;
    public int type3;
    public int type7;
    public int type8;

    public int type12;
    public int type13;
    public int type14;
    public int type16;


	public Musical() {
		System.out.println("not        important constructor");
	}


	public void setMusical() throws ExceptionInInitializerError {
		throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type1 + type3 + type15 + type7 + type8 + type12 + type13 + type14 + type16);
		}

}
