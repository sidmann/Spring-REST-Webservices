package com.example.project1;

import java.io.FileOutputStream;
import java.util.Arrays;

import javax.tools.FileObject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class RequestBodyController {
	
	@RequestMapping("p1")
	public Person save(@RequestBody Person person)
	{
		System.out.println("from save");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println();
		return person;
	}
	
	@RequestMapping("p2")
	public Employee save1(@RequestBody Employee employee)
	{
		System.out.println("from save");
		System.out.println(employee.getId());
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getAge());
		return employee;
	}
	
	@RequestMapping("p3")
	public Person save3(@RequestBody Person person)
	{
		System.out.println("from save");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.getEmail());
		return person;
	}
	
	@RequestMapping("p4")
	public Person save4(@RequestBody Person person)
	{
		System.out.println("from save");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(Arrays.toString(person.getEmail()));
		System.out.println(person.getAddress().getHouseNo() + ", " + person.getAddress().getStreet() + ", " + person.getAddress().getState());
		return person;
	}
	
	@RequestMapping("student")
	public Student saveStudent(@RequestBody Student student)
	{
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(Arrays.toString(student.getMarks()));
		System.out.println(student.getMobileNumber());
		return student;
	}
	
	@RequestMapping("upload")
	public String fileUpload1(@RequestParam MultipartFile file) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(file.getOriginalFilename());
		fout.write(file.getBytes());
		fout.flush();
		fout.close();
		return "upload success";
	}
	
	@RequestMapping("upload1")
	public String fileUpload2(@RequestParam MultipartFile profilepic) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(profilepic.getOriginalFilename());
		fout.write(profilepic.getBytes());
		fout.flush();
		fout.close();
		return "success";
	}
	
	@RequestMapping("upload2")
	public String fileUpload3(@RequestParam MultipartFile profilepic,
			                  @RequestParam MultipartFile resume) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(profilepic.getOriginalFilename());
		fout.write(profilepic.getBytes());
		fout.flush();
		fout.close();
		
		FileOutputStream fout1 = new FileOutputStream(resume.getOriginalFilename());
		fout1.write(resume.getBytes());
		fout1.flush();
		fout1.close();
		return "success";
	}
}
