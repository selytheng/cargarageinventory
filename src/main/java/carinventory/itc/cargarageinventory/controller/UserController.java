package carinventory.itc.cargarageinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import carinventory.itc.cargarageinventory.entity.UserForm;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserDetailsService userDetailsServicel;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") UserForm form) {
        // Implement user registration logic here, including password encoding
        // You can use the UserRepository to save the user entity
        // Redirect to login page after successful registration
        return "redirect:/login";
    }

}
