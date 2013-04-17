package org.htia6761.criteria;

import java.util.ArrayList;
import java.util.List;

import org.htia6761.inter.Criteria;
import org.htia6761.person.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> malePersons = new ArrayList<Person>();
		for (Person person : malePersons) {
			if (person.getGender().equalsIgnoreCase("MALE")) {
				malePersons.add(person);
			}
		}
		return malePersons;

	}

}
