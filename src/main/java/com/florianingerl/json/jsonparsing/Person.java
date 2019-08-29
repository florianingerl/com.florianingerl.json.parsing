package com.florianingerl.json.jsonparsing;

import java.util.List;

public class Person {
	
	public Person() {
		
	}
	
    public Person(String name, int age, boolean isMarried, List<String> hobbies,
            List<Person> kids) {
        this.name = name;
        this.age = age;
        this.married = isMarried;
        this.hobbies = hobbies;
        this.kids = kids;
    }

    public Person(String name, int age) {
        this(name, age, false, null, null);
    }

    private String name;
    private Integer age;
    private Boolean married;
    private List<String> hobbies;
    private List<Person> kids;

 

    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<Person> getKids() {
		return kids;
	}

	public void setKids(List<Person> kids) {
		this.kids = kids;
	}

	@Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", hobbies=" + hobbies +
                ", kids=" + kids +
                '}';
    }
}
