package user_management_t5_btetoutt.app.account;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import user_management_t5_btetoutt.domain.model.Account;
import user_management_t5_btetoutt.domain.service.userdetails.SampleUserDetails;

@Controller
@RequestMapping("account")
public class AccountController {
    @RequestMapping
    public String view(
            @AuthenticationPrincipal SampleUserDetails userDetails, 
            Model model) {
 
        Account account = userDetails.getAccount();
        model.addAttribute(account);
        return "account/view";
    }
}
