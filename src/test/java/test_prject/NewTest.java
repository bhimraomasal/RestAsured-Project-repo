package test.java.test_prject;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver=new ChromeDriver();
	
  @Test
  public void f() {
	  driver.navigate().to("https://www.google.com");
	  System.out.println("Hello");
	  driver.quit();
	  
	  Employee emp=new Employee (122,"bhimrao");
	  Employee emp1=new Employee (122,"bhimrao");
	  Assert.assertEquals(emp, emp1);
	  
	  Map<String,Object> m=new HashMap<>();
	  m.put("Employee", emp);
	  m.put("deparment","QA");
	  System.out.println(m.get("Employee"));
	  
	  Employee e=(Employee) m.get("Employee");
	  System.out.println(e.id+ " "+e.name);
  }
}

class Employee
{
	String name;
	int id;
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
    public boolean equals(Object obj) {
        Employee emp = (Employee) obj;

        return this.id == emp.id &&
               this.name.equals(emp.name);
    }

	/*
	 * @Override public int hashCode() { return Objects.hash(id, name); }
	 */
	
}

