package org;

import org.filter.Filter;

public class FilterManager {
	FilterChain filterChain;
	
	public FilterManager(Target target) {
		// TODO Auto-generated constructor stub
		filterChain = new FilterChain();
		filterChain.setTarget(target);
	}
	
	public void setFilter(Filter filter) {
		filterChain.addFilter(filter);
	}
	
	public void filterRequest(String request) {
		filterChain.execute(request);
	}
	
}
