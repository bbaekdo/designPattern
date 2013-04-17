package com.llitfkitfk.item;

import com.llitfkitfk.inter.Item;
import com.llitfkitfk.inter.Packing;
import com.llitfkitfk.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	@Override
	public abstract float price();
	
}
