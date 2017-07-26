package com.example.terasoluna.app.welcome;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.terasoluna.domain.model.Account;
import com.example.terasoluna.domain.service.userdetails.AccountDetails;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HelloController {

    private static final Logger logger = LoggerFactory
            .getLogger(HelloController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Locale locale, Model model,
    		           @AuthenticationPrincipal AccountDetails userDetails) {
    	
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        Account account = userDetails.getAccount();
        
        String local_status  = account.getStatus();
        
        System.out.println(local_status);
        
        if (local_status.equals("INIT")) {
        	System.out.println(local_status+" change");
        	return "password/change/changeForm";
        }
        else{
        	System.out.println(local_status+" welcome");
        	//return "welcome/home";
        	return "top/menu";
        }
    }

}
