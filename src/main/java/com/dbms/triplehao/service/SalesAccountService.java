package com.dbms.triplehao.service;
import com.dbms.triplehao.entity.SalesAccount;

import java.util.List;

public interface SalesAccountService {

    boolean addSalesAccount(SalesAccount salesAccount);
    List<SalesAccount> searchSalesAccount(String username);
}
