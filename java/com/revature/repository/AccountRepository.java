package com.revature.repository;

import com.revature.entity.Account;
import com.revature.entity.TDetails;
import java.util.List; 
import com.revature.entity.AccDetails;

public interface AccountRepository {
	void save(TDetails tdetails);
	void save(AccDetails accdetails);
	void update(Account account);
	public void tsave(TDetails tdetails);
	public List<TDetails> getTransfer();
	public List<AccDetails> getAccDetails(int n1);
	void edit(String n1);
	public void delete(int id);
	public int count();
	public void getaadharc(int n1);
	public int countAcc();

}