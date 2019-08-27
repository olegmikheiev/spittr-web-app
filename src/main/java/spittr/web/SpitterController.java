package spittr.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.RestMapping;
import spittr.data.Spitter;
import spittr.data.SpitterRepository;

import javax.validation.Valid;

@Controller
@RequestMapping(RestMapping.SPITTER)
@Slf4j
public class SpitterController {
    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registrationForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registrationForm";
        }

        spitterRepository.save(spitter);
        final String redirectUrl = String.join("", "redirect:", RestMapping.SPITTER, "/", spitter.getUsername());
        log.info("Redirecting user to {}", redirectUrl);
        return redirectUrl;
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        model.addAttribute(spitterRepository.findByUsername(username));
        return "spitterProfile";
    }

}
