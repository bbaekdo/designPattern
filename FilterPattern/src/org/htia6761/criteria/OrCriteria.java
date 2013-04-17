package org.htia6761.criteria;

import java.util.List;

import org.htia6761.inter.Criteria;
import org.htia6761.person.Person;

public class OrCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;
	
	
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for(Person person : otherCriteriaItems) {
			if(!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}

}
