package com.torryharris.trainultimate.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Passenger implements Comparable<Passenger> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sNo;
    private String name;
    private int age;
    private char gender;

    public Passenger(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public int getsNo() {
		return sNo;
	}


	public void setsNo(int sNo) {
		this.sNo = sNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	@Override
    public int compareTo(Passenger o) {
        return name.compareTo(o.name);
    }


	@Override
	public String toString() {
		return "Passenger [sNo=" + sNo + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}