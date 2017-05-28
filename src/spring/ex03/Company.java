package spring.ex03;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

public class Company {
	private Collection<Department> department;

	public Collection<Department> getDepartment() {
		return department;
	}

	public void setDepartment(Collection<Department> department) {
		this.department = department;
	}
	
	private Map<String, Department> dept;

	public Map<String, Department> getDept() {
		return dept;
	}

	public void setDept(Map<String, Department> dept) {
		this.dept = dept;
	}
	
	private Properties d;//Map<String, String> = Properties

	public Properties getD() {
		return d;
	}

	public void setD(Properties d) {
		this.d = d;
	}
	
	
}
