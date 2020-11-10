package com.yuta.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class MySampleBean {
	private int counter = 0;
	private int max = 10;

	@Autowired
	public MySampleBean(ApplicationArguments args) {
		List<String> files = args.getNonOptionArgs();
		try {
			max = Integer.parseInt(files.get(0));
		} catch (NumberFormatException e
				) {
			e.printStackTrace();
		}
	}

	public int count() {
		counter++;
		counter = counter > max ? 0 : counter;
		return counter;
	}
}
