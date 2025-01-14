package entities;

public class Employee {

	public Integer id;
	public String name;
	public double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public double increaseSalary(double percentage) {
		return (percentage / 100) * salary + salary;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
