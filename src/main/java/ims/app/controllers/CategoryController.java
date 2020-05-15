package ims.app.controllers;

import ims.app.dao.CategoryRepo;
import ims.app.dao.ItemRepo;
import ims.app.entities.Category;
import ims.app.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    ItemRepo itemRepo;

    @GetMapping("/new")
    public String newCategory(Model model, Item item) {
        Category aCategory = new Category();
        List<Item> items = itemRepo.findAll();
        model.addAttribute("allItems", items);
        model.addAttribute("category", aCategory);
        return "category/new-category";
    }

    @PostMapping("/save")
    public String saveCategory(Category category, @RequestParam List<Long> items, Model model) {
        categoryRepo.save(category);
        Iterable<Item> itemIterable = itemRepo.findAllById(items);
        for (Item item : itemIterable) {
            item.setCategory(category);
    itemRepo.save(item);
        }
        return "redirect:/category/new";
    }

}
