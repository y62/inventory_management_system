package ims.app.controllers;

import ims.app.dao.CategoryRepo;
import ims.app.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;

    @GetMapping("/new")
    public String newCategory(Model model) {
        Category category = new Category();
        model.addAttribute("category", category);
        return "category/new-category";
    }

    @PostMapping("/save")
    public String saveCategory(Category category) {
        categoryRepo.save(category);
        return "redirect:/new";
    }

}
