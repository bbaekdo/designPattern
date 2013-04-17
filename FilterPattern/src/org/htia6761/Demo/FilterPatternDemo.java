package org.htia6761.Demo;

import java.util.ArrayList;
import java.util.List;

import org.htia6761.criteria.AndCriteria;
import org.htia6761.criteria.CriteriaFemale;
import org.htia6761.criteria.CriteriaMale;
import org.htia6761.criteria.CriteriaSingle;
import org.htia6761.criteria.OrCriteria;
import org.htia6761.inter.Criteria;
import org.htia6761.person.Person;

public class FilterPatternDemo {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria single = new CriteriaSingle();
		Criteria female = new CriteriaFemale();
		Criteria male = new CriteriaMale();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleFemale = new OrCriteria(single, female);

		// printPerson(male.meetCriteria(persons));
		// printPerson(single.meetCriteria(persons));
		System.out.println("\n \n");
		printPerson(female.meetCriteria(persons));
	}

	public static void printPerson(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person name: " + person.getName()
					+ "  gender: " + person.getGender() + " Marital status: "
					+ person.getMaritalStatus());
		}
	}
}
