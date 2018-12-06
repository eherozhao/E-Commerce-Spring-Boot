package com.dbms.triplehao.web;

import com.alibaba.fastjson.JSON;
import com.dbms.triplehao.entity.CustomerAccount;
import com.dbms.triplehao.service.CustomerAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)       //允许后台做跨域传输
@RestController
@RequestMapping("/superadmin")
public class CustomerAccountController
{
    @Autowired
    CustomerAccountService customerAccountService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("pwd");
        String role = request.getParameter("role");
        LinkedHashMap<String, Object> result=new LinkedHashMap<>();

        if (role=="username"||role.equals("username"))
        {
            CustomerAccount customerAccount = new CustomerAccount();
            customerAccount.setUsername(username);
            customerAccount.setPassword(password);
            boolean user=customerAccountService.addCustomerAccount(customerAccount);
            if (user)
            {
                result.put("data","success");
                result.put("msg","register success");
                result.put("code","200");
            }
        }
        else
        {
            result.put("code","202");
        }
        String json=JSON.toJSON(result).toString();
        return json;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request)
    {
        LinkedHashMap<String, Object> result = new LinkedHashMap<>();
        String password=request.getParameter("pwd");
        String username=request.getParameter("username");
        String role=request.getParameter("role");
        if (role=="username"||role.equals("username"))
        {
            CustomerAccount customerAccount = new CustomerAccount();
            List<CustomerAccount> list= customerAccountService.searchCustomerAccount(username);
            if (list==null||list.size()==0)
            {
                result.put("info", "user not exist");
                result.put("code","201");
                result.put("data","success");
            }
            else{
                if (list.get(0).getPassword().equals(password))
                {
                    result.put("info","login success");
                    result.put("code","200");
                    result.put("data","success");
                }
                else
                {
                    result.put("info", "pwd error");
                    result.put("code", "202");
                    result.put("data", "success");
                }
            }
        }
        else
        {
            result.put("info", "pwd error");
            result.put("code", "202");
            result.put("data", "success");
        }
        String json=JSON.toJSON(result).toString();
        return json;
    }
}
