package user_management_t5_btetoutt.app.welcome;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;

import user_management_t5_btetoutt.app.account.AccountPassChangeForm;
import user_management_t5_btetoutt.domain.model.Account;
import user_management_t5_btetoutt.domain.service.userdetails.SampleUserDetails;
import user_management_t5_btetoutt.domain.service.account.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HelloController {

    @Inject
    AccountSharedService accountSharedService;	
    
    //Form側の受け取り
    @ModelAttribute
    public Account setUpForm() {
    	Account accountform = new Account();
        return accountform;
    }
    
    //Form側の受け取り
    @ModelAttribute(value = "accountform")
    public Account setUpaccountForm() {
        return new Account();
    }
    
	
    private static final Logger logger = LoggerFactory
            .getLogger(HelloController.class);

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String home(Locale locale, Model model,@AuthenticationPrincipal SampleUserDetails userDetails) {
        logger.info("Welcome home! The client locale is {}.", locale);

        
        /*
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
                DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        */
        Account accountmodel = userDetails.getAccount();
        
        String local_status  = accountmodel.getStatus();
        
        System.out.println(accountmodel.getUserid());
        
        model.addAttribute("accountmodel", accountmodel);
        
        if (local_status.equals("INIT")) {
        	return "password/change/changeForm";
        }
        else{

        	return "top/menu";
        }
    }
    
    @RequestMapping(value = "/passwordFinish", method = RequestMethod.POST)
    public String passfinish(Account accountform,Model model) {
    	
    		accountSharedService.update(accountform.getUserid());
    		
    		Account accountmodel = new Account();
    		
    		accountmodel.setUserid(accountform.getUserid());
    		
    		model.addAttribute("accountmodel", accountmodel);
    		
        	return "password/change/passwordFinish";
    }
    
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public String top(Account account,Model model) {
    	
    		//省略化 Account accountform = new Account();
    	
    		System.out.println(account.getUserid());

    	    Account accountform = accountSharedService.findOne(account.getUserid());
    	
    	    model.addAttribute("accountform", accountform);    
    	
        	return "top/menu";
    }

}
