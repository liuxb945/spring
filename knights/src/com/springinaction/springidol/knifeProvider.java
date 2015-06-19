package com.springinaction.springidol;

import javax.inject.Provider;

public class knifeProvider implements Provider<Knife> {

	@Override
	public Knife get() {
		// TODO Auto-generated method stub
		return new Knife();
	}

}
