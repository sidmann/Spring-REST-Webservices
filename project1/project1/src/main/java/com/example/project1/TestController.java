package com.example.project1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("f1")
	public String test() {
		return "done";
	}
	
	@RequestMapping("t1")   //http://localhost:9091/t1?param=hello
	public String test1(@RequestParam String param) {
		System.out.println("from param: " + param);
		return "your value: " + param;
	}

	@RequestMapping("t2")   //http://localhost:9091/t2?param1=Sidhant&param2=Mann   // in the query string we can supply any numbers of request params
	public String test2(@RequestParam String param1, @RequestParam String param2) 
	{
		System.out.println("from param: " + param1 + param2);
		return "your value: " + param1 + ", " + param2;
	}
	
	@RequestMapping("t3")  // http://localhost:9091/t3?firstName=Sidhant&lastName=Mann&age=31&weight=83.62  // we can supply multiple requestParams in single query(any number/any type)
	public String test3(@RequestParam String firstName, 
						@RequestParam String lastName,
						@RequestParam int age,
						@RequestParam double weight) 
	{
		System.out.println("from param: " + firstName + ", " + lastName + ", " + age + ", " + weight);
		return "your value: " + firstName + ", " + lastName + ", " + age + ", " + weight;
	}
	
	@RequestMapping("t4") 
	public int test4(@RequestParam String strValue)   // converting string into numeric without parseInt() method
	{
		int intValue = 0;
		int multiplier = 1;
		char c1;
		for (int i = strValue.length() - 1; i >= 0; i--) {
			c1 = strValue.charAt(i);
			intValue = ((c1 - '0') * multiplier) + intValue;
			multiplier *= 10;
		}
		return intValue * intValue;
	}			// http://localhost:9091/t4?strValue=aaa
	
	@RequestMapping("t5") 
	public int test5(@RequestParam String strValue1 ,@RequestParam String strValue2)   // converting string into numeric without parseInt() method
	{
		int intValue1 = 0;
		int intValue2 = 0;
		int multiplier = 1;
		char c1;
		for(int i = strValue1.length() - 1; i >= 0; i--)
		{
			c1 = strValue1.charAt(i);
			intValue1 = ((c1 - '0') * multiplier) + intValue1;
			multiplier *= 10;
		}		
		multiplier = 1;
		for(int i = strValue2.length() - 1; i >= 0; i--)
		{
			c1 = strValue2.charAt(i);
			intValue2 = ((c1 - '0') * multiplier) + intValue2;
			multiplier *= 10;
		}		 
	return intValue1 * intValue2;
	}
	
	@RequestMapping("t6")
	public String test6(@RequestParam String param)
	{
		System.out.println("from test6:" + param);
		return param;
	}
	
	@RequestMapping("t7")
	public String test7(@RequestParam(defaultValue = "hello") String param)
	{
		System.out.println("from test7:" + param);
		return param;
	}
	
	@RequestMapping("t8")
	public String test8(@RequestParam(name = "arg") String param)
	{
		System.out.println("from test8:" + param);
		return param;
	}
	
	@RequestMapping("t9")
	public String test9(@RequestParam(value = "arg") String param)
	{
		System.out.println("from test9:" + param);
		return param;
	}
	
	@RequestMapping("t10")
	public String test10(@RequestParam(required = false) String param)
	{
		System.out.println("from test10:" + param);
		return param;
	}
}
