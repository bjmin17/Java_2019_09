package com.biz.classes.service.children;

import com.biz.classes.service.parents.Animal;

public class Cat extends Animal {
	
	// 생성자를 별도로 만들지 않으면 cat이 아닌 Animal 이라는 생성자를 호출하게 되어 있음
	public Cat() {
		super();
	}
	
	public void setName() {
		this.name = "나비";
	}
	
//	public String getName() {
//		return this.name;
//	}

}
