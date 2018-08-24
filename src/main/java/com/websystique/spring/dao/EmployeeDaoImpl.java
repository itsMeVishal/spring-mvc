package com.websystique.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.spring.model.Employee;
@Transactional
@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	
	
	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployees() {
		
		Query query = getSession().getNamedQuery("findAllEmp");
		List<Employee> list=query.list();
		return list;}

	public void deleteEmployeeBySsn(String ssn) {
		Query query = getSession().createSQLQuery("delete from Employee where id = :ssn");
		query.setString("ssn", ssn);
		query.executeUpdate();
	}

	public Employee findBySsn(String ssn) {
		Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("ssn", ssn));
		return (Employee) criteria.uniqueResult();
	}

	public void updateEmployee(Employee employee) {
		getSession().update(employee);
	}

	@Override
	public void delete(int id) {

		Employee ent = (Employee) getSession().load(Employee.class, id);
		getSession().delete(ent);
				
	}
	
}