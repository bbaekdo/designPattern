package org.htia6761.criteria;

import java.util.ArrayList;
import java.util.List;

import org.htia6761.inter.Criteria;
import org.htia6761.person.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> femalePersons = new ArrayList<Person>();
		for(Person person : femalePersons) {
			if(person.getGender().equalsIgnoreCase("FEMALE")) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}
	
}
