package cz.danieldockal.fapiProjekt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/*
 * © Created by Daniel Dockal
 *        1.5.2022
 * */

@Controller
public class MainController {

    @PostMapping("/")
    public String processDataInput(@Valid @ModelAttribute UserData userData, BindingResult errors, Model model) {

        if (errors.hasErrors()) {
            return "index";
        }
        model.addAttribute("userData", userData);
        return "recapitulation";
    }

    @GetMapping("/")
    public String loadDataInput(Model model) {
        model.addAttribute("userData", new UserData());
        return "index";
    }

    @GetMapping("/recapitulation")
    public String recap(Model model) {

        return "recapitulation";
    }

}
