package com.luv2code.main;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.luv2code.pojo.Student;
import com.luv2code.pojo.StudentFull;

public class Driver {

	public static void main(String[] args) {

		try {
			// create the object mapper
			ObjectMapper objectMapper = new ObjectMapper();

			// read json file and map/convert to Java pojo

			Student student = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);

			StudentFull studentfull = objectMapper.readValue(new File("data/sample-full.json"), StudentFull.class);
			// print out few parameter

			System.out.println(student.getFirstName() + "   " + student.getLastName());

			Stream<String> stream = Arrays.stream(studentfull.getLanguages());
			System.out.println(studentfull.getAddress().getCountry());
			stream.forEach(str -> System.out.println(str));

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
