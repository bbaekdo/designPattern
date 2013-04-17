package org.htia6761.criteria;

import java.util.ArrayList;
import java.util.List;

import org.htia6761.inter.Criteria;
import org.htia6761.person.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> singlePersons = new ArrayList<Person>();
		for(Person person : singlePersons) {
			singlePersons.add(person);
		}
		return persons;
	}

}
