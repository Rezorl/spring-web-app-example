package com.rezorl.spring5webapp.controllers;

import com.rezorl.spring5webapp.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class AuthorController {
    private final AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", this.authorRepository.findAll());
        System.out.println("model = asd" + model);
        return "authors/list";
    }

}
