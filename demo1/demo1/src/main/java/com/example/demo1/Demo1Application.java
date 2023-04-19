package com.example.demo1;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("spring boot app started ...");
	}
	
	@GetMapping("t1")
	public int test1()
	{
		System.out.println("from test1");
		return 500;
	}
	
	@GetMapping("t2")
	public boolean test2()
	{
		System.out.println("from test2");
		return true;
	}

	@GetMapping("t3")
	public char test3()
	{
		System.out.println("from test3");
		return 'a';
	}
	
	@GetMapping("t4")
	public String test4()
	{
		System.out.println("from test4");
		return "java";
	}
	
	@GetMapping("t5")
	public double test5()
	{
		System.out.println("from test5");
		return 4.5;
	}
	
	@GetMapping("t6")
	public int[] test6()
	{
		System.out.println("from test6");
		int[] elements = {10, 20, 30};
		return elements;
	}
	
	@GetMapping("t7")
	public HashMap<String, Integer> test7()
	{
		System.out.println("from test7");
		HashMap<String, Integer> map = new HashMap();
		map.put("abc", 100);
		map.put("xyz", 200);
		map.put("hello", 300);
		return map;
	}
	
	@GetMapping("t8")
	public ArrayList<HashMap<String, Integer>> test8()
	{
		System.out.println("from test8");
		HashMap<String, Integer> map1 = new HashMap();
		map1.put("abc", 100);
		map1.put("xyz", 200);
		map1.put("hello", 300);
		HashMap<String, Integer> map2 = new HashMap();
		map2.put("abc", 500);
		map2.put("xyz", 700);
		map2.put("hello", 900);
		ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
		list.add(map1);
		list.add(map2);
		return list;		
	}
	
	@GetMapping("p1")
	public Person test9()
	{
		Person p1 = new Person();
		p1.setFirstName("abc");
		p1.setLastName("xyz");
		p1.setAge(22);
		return p1;
	}
	
	@GetMapping("student")
	public Student getStudent()
	{
		Student s1 = new Student();
		s1.setFirstName("abc");
		s1.setLastName("xyz");
		String[] emailIds = {"abc.com", "xyz.com"};
		s1.setEmailIds(emailIds);
		long[] mobileNumbers = {98989898L, 89898989L};
		s1.setMobileNumbers(mobileNumbers);
		ArrayList<String> projectNames = new ArrayList<>();
		projectNames.add("city");
		projectNames.add("sbi");
		projectNames.add("finance");
		s1.setProjectNames(projectNames);
		Address address = new Address();
		address.setCity("Blr");
		address.setHouseNo("123/B");
		address.setStreetName("BTM");
		address.setState("Karnataka");
		s1.setAddress(address);
		return s1;
	}
	
	@GetMapping("t10")
	public void test10()
	{
		System.out.println("from test10");
	}
	
}
//S.O.P msg is a console msg