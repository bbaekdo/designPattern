package org.htia6761.criteria;

import java.util.List;

import org.htia6761.inter.Criteria;
import org.htia6761.person.Person;

public class AndCriteria implements Criteria {

	private Criteria criteria;
	private Criteria otherCriteria;
	
	
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		super();
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}


	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}
	
}
