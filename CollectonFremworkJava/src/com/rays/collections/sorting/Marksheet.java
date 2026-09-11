package com.rays.collections.sorting;

public class Marksheet implements Comparable<Marksheet>{
	
	private String rollNO;
	private String name;
	private int phy;
	
	public Marksheet(String rollNo, String name, int phy) {
		this.rollNO = rollNo;
		this.name = name;
		this.phy = phy;
	}
	
	public int compareTo(Marksheet o) {
		if(this.name.equals(o.name)) {
		  return this.phy -o.phy;
		}
		else if(this.phy==o.phy) {
			return this.rollNO.compareTo(o.rollNO);
		}
		else {
			return this.rollNO.compareTo(o.rollNO);
		}
	}
	public String toString(){
		return "rollNo "+rollNO+ "name "+name+ "phy "+phy;
		
	}

}
