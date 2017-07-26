package com.example.terasoluna.app.password;

import javax.inject.Inject;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.terasoluna.gfw.common.message.ResultMessages;

import com.example.terasoluna.domain.model.password.PasschangeForm;
import com.example.terasoluna.domain.service.account.AccountService;

@Controller
@SessionAttributes(value = { "passchangeForm" })
@RequestMapping("password")
public class PasschangeController {
	@Inject
    AccountService accountService;
	
    @ModelAttribute(value = "passchangeForm")
    public PasschangeForm setUpPasschangeForm() {
        return new PasschangeForm();
    }
    
    @RequestMapping(value = "/passchange", method = RequestMethod.POST)
    public String passchange_update(){
    		
    	/*
            @AuthenticationPrincipal AccountDetails userDetails,
            @Validated({ Wizard1.class, Wizard2.class }) AccountUpdateForm form,
            BindingResult result, RedirectAttributes attributes, SessionStatus sessionStatus) {

        if (result.hasErrors()) {
            ResultMessages messages = ResultMessages.error();
            messages.add("e.st.ac.5001");
            throw new IllegalOperationException(messages);
        }

        Account account = beanMapper.map(form, Account.class);
        accountService.update(account);
        userDetails.setAccount(account);
        attributes.addFlashAttribute("account", account);
        sessionStatus.setComplete();  // (4)

	    */
        return "redirect:/changeForm?finish";
    }
    
    @RequestMapping(value = "/passchange", method = RequestMethod.GET, params = "finish")
    public String passchange_finish(){
    	return "password/finish";
    }
    
    @RequestMapping(value = "/passchange", method = RequestMethod.GET, params = "home")
    public String home(SessionStatus sessionStatus) {
        sessionStatus.setComplete();
        return "redirect:/goods";
    }
    
}
