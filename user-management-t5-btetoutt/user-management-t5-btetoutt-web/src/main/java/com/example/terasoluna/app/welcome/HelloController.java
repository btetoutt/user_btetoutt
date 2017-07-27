package com.example.terasoluna.app.welcome;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.terasoluna.domain.model.Account;
import com.example.terasoluna.domain.service.userdetails.AccountDetails;

/**
 * Handles requests for the application home page.
 */
@Controller
//@SessionAttributes(value = { "accountForm" })
public class HelloController {

    private static final Logger logger = LoggerFactory
            .getLogger(HelloController.class);
    
	//@Inject
	//Mapper beanMapper;
	
	/*
    @ModelAttribute(value = "accountForm")
    public AccountForm setUpAccountForm() {
        return new AccountForm();
    }
    */

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Locale locale, Model model,AccountForm accountform,
    		           @AuthenticationPrincipal AccountDetails userDetails) {
    	
        logger.info("Welcome home! The client locale is {}.", locale);

        /*
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);
        
        */

        Account account = userDetails.getAccount();
        
        String local_status  = account.getStatus();
        
        //beanMapper.map(account, accountform);
        
        System.out.println("-----HelloController_START-----");
        System.out.println(accountform.getUsername());
        System.out.println("-----HelloController_END-----");
        
        //model.addAttribute("accountform", account);

        if (local_status.equals("INIT")) {
        	return "password/changeForm";
        }
        else{
        	return "top/menu";
        }
    }

}
