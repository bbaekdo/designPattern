package com.llitfkitfk.item;

import com.llitfkitfk.inter.Item;
import com.llitfkitfk.inter.Packing;
import com.llitfkitfk.packing.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	@Override
	public abstract float price();
	
}
