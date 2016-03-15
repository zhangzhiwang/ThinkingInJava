package com.asiainfo.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * 空对象
 * 
 * @author Zhiwang Zhang
 * @date 2016年3月15日 下午8:40:00
 */
public class Test32 {
	public static void main(String[] args) {
		Staff s = new Staff();
		s.addPosition("CEO", "CTO", "COO");
		s.fillPerson("CEO", new Person1("p1", "addr1"));
		if (s.isPositionAvailable("CTO")) {
			s.fillPerson("CTO", new Person1("p2", "addr2"));
		}
		System.out.println(s.list);
	}

}

interface Null {
}// 代表空对象标识

class Person1 {
	private String name;
	private String addr;

	public Person1(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public Person1() {
		super();
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", addr=" + addr + "]";
	}

}

class NullPerson extends Person1 implements Null {
	private static final NullPerson NP = new NullPerson();

	private NullPerson() {
	}

	public static NullPerson getNullPerson() {// 不考虑线程安全性
		return NP;
	}

	@Override
	public String toString() {
		return "NullPerson";
	}

}

class Position {
	private String jobTitle;
	private Person1 p;

	public Position(String jobTitle, Person1 p) {
		super();
		if (p == null) {
			this.p = NullPerson.getNullPerson();
		} else {
			this.p = p;
		}
		this.jobTitle = jobTitle;
	}

	public Position(String jobTitle) {
		super();
		this.jobTitle = jobTitle;
		p = NullPerson.getNullPerson();
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Person1 getP() {
		return p;
	}

	public void setP(Person1 p) {
		if (p == null) {
			p = NullPerson.getNullPerson();
		} else {
			this.p = p;
		}
	}

	@Override
	public String toString() {
		return "Position [jobTitle=" + jobTitle + ", p=" + p + "]";
	}

}

class Staff {
	public List<Position> list = new ArrayList<Position>();

	public void addPosition(String... jobTitles) {
		for (String jt : jobTitles) {
			list.add(new Position(jt));
		}
	}

	public boolean isPositionAvailable(String jobTitle) {
		for (Position p : list) {
			if (p.getJobTitle().equals(jobTitle) && p.getP() == NullPerson.getNullPerson()) {
				return true;
			}
		}
		return false;
	}

	public void fillPerson(String jobTitle, Person1 person) {
		for (Position p : list) {
			if (p.getJobTitle().equals(jobTitle) && p.getP() == NullPerson.getNullPerson() && person != NullPerson.getNullPerson()) {
				p.setP(person);
				return;
			}
		}
		System.out.println("error");
	}
}