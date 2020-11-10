package com.yuta.springboot;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

public class MyDialect extends AbstractProcessorDialect {

	private static final String DIALECT_NAME = "My Dialect";

	public MyDialect() {
		super(DIALECT_NAME, "my", StandardDialect.PROCESSOR_PRECEDENCE);
	}

	protected MyDialect(String name, String prefix, int processorPrecedence) {
		super(name, prefix, processorPrecedence);
	}

	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		// TODO Auto-generated method stub
		final Set<IProcessor> processors = new HashSet<IProcessor>();
		processors.add(new MyPageAttributeTagProcessor(dialectPrefix));
		return processors;
	}

}
