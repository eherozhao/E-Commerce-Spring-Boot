package com.dbms.triplehao.service.impl;

import com.dbms.triplehao.dao.SalesAccountDao;
import com.dbms.triplehao.entity.SalesAccount;
import com.dbms.triplehao.service.SalesAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalesAccountServiceImpl implements SalesAccountService {
    @Autowired
	SalesAccountDao salesAccountDao;

	@Transactional
	@Override
	public boolean addSalesAccount(SalesAccount salesAccount)
	{
		if (salesAccount.getUsername() != null && !"".equals(salesAccount.getUsername()) && salesAccount.getPassword() != null && !"".equals(salesAccount.getPassword()))
		{
			try {
				int effectedNum = salesAccountDao.insertSalesAccount(salesAccount);
				if (effectedNum>0)
				{
					return true;
				}
				else
				{
					throw new RuntimeException("Insert failed!");
				}
			}
			catch (Exception e)
			{
				throw new RuntimeException("Insert failed:" + e.getMessage());
			}

		}
		else
		{
			throw new RuntimeException("Insert data can not be null!!");
		}
	}

	@Override
	public List<SalesAccount> searchSalesAccount(String username)
	{
		return salesAccountDao.searchSalesAccount(username);
	}

}