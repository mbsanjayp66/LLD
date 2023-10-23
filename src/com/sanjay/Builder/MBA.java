package com.sanjay.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBA extends StudentBuilder {

	@Override
	public StudentBuilder setSubject() {
		List<String>subject = new ArrayList<>();
		subject.add("MAth");
		subject.add("CA");
		subject.add("CFA");
		this.subject = subject;
		return this;
	}

}
