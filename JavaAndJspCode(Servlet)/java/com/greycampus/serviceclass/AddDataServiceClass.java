package com.greycampus.serviceclass;

import java.util.ArrayList;

import com.greycampus.dao.UserDaoClass;
import com.greycampus.getset.GetterSetter;

public class AddDataServiceClass {

	public void adduser(GetterSetter gs) {
		double salary = gs.getSalary();
		salary = 0.70 * salary;
         gs.setSalary(salary);
         UserDaoClass userDaoClass = new UserDaoClass();
         userDaoClass.addDao(gs);
	}
	public ArrayList<GetterSetter> search(String eno){
      UserDaoClass userDaoClass = new UserDaoClass();
      ArrayList<GetterSetter> searchDao = userDaoClass.searchDao(eno);
      return searchDao;
	}
	public int delete(String eno) {
		UserDaoClass userDaoClass = new UserDaoClass();
		int deleteDao = userDaoClass.deleteDao(eno);
		return deleteDao;
	}
	public int update(String neno, String ename, String esalary, String eno) {
		UserDaoClass userDaoClass = new UserDaoClass();
		int updateDao = userDaoClass.updateDao(neno, ename, esalary, eno);
		return updateDao;
	}
}
