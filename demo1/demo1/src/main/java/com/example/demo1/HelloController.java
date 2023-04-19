package com.example.demo1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("h1")
	public String hello1()
	{
		System.out.println("from hello1");
		return "I am from hello1";
	}
	
	@RequestMapping("h2/{arg}")
	public String hello2(@PathVariable String arg)
	{
		System.out.println("from hello2");
		return "This is your value: " + arg;
	}
	
	@RequestMapping("h3/{param}")
	public String hello3(@PathVariable String param)
	{
		System.out.println("from hello3: " + param);
		return "This is your value: " + param;
	}
	
	@RequestMapping("h4/{param}")
	public String hello4(@PathVariable("param") String s1)
	{
		System.out.println("from hello4: " + s1);
		return "This is your value: " + s1;
	}
	
	@RequestMapping("h5/{firstName}")
	public String hello5(@PathVariable String firstName)
	{
		System.out.println("from hello5: " + firstName);
		return "This is your value: " + firstName;
	}
	
	@RequestMapping("h6/{firstName}")
	public String hello6(@PathVariable("firstName") String firstName)
	{
		System.out.println("from hello6: " + firstName);
		return "This is your value: " + firstName;
	}
	
	@RequestMapping("h7/{firstName}")
	public String hello7(@PathVariable("firstName") String fn)
	{
		System.out.println("from hello7: " + fn);
		return "This is your value: " + fn;
	}
	
	@RequestMapping("h8/{firstName}/{lastName}")
	public String hello8(@PathVariable("firstName") String fn,
						 @PathVariable String lastName)
	{
		System.out.println("from hello8: " + fn + ", " + lastName);
		return "This is your value: " + fn + ", " + lastName;
	}
	
	@RequestMapping("h9/firstName/{firstName}/lastName/{lastName}/age/{age}")
	public String hello9(@PathVariable("firstName") String fn,
						 @PathVariable String lastName,
						 @PathVariable Integer age)
	{
		System.out.println("from hello9: " + fn + ", " + lastName + ", " + age);
		return "This is your value: " + fn + ", " + lastName + ", " + age;
	}
	
	@RequestMapping("h10/{firstName}/{lastName}/{age}")
	public String hello10(@PathVariable("firstName") String fn,
			@PathVariable String lastName,
			@PathVariable Integer age)
	{
		System.out.println("from hello10: " + fn + ", " + lastName + ", " + age);
		return "This is your value: " + fn + ", " + lastName + ", " + age;
	}
	
	@RequestMapping("h11/{s1}")
	public String test11(@PathVariable String s1) //Path variable is a mandatory but without this it will entirely looking for the entire API.
	{
		System.out.println("from test11");
		return "Your value: " + s1;
	}
	
	@RequestMapping("h11")
	public String test12()
	{
		System.out.println("from test12");
		return "Your value from test12";
	}
	
	@RequestMapping("h13")
	public String test13(@PathVariable String s1)
	{
		System.out.println("from test13");
		return "Your value: " + s1;
	}
	
	@RequestMapping("h14")
	public String test14(@PathVariable(required = false) String s1)
	{
		System.out.println("from test14");
		return "Your value: " + s1;
	}
	
	@RequestMapping("h15/{abc}")
	public String test15(@PathVariable(value = "abc") String s1)
	{
		System.out.println("from test15");
		return "Your value: " + s1;
	}
	
}
