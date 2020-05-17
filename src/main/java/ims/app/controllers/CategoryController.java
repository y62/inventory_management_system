package ims.app.controllers;

import ims.app.dao.CategoryRepo;
import ims.app.dao.ProductRepo;
import ims.app.entities.Category;
import ims.app.entities.Product;
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
    ProductRepo productRepo;

    private String categoryList = "category/category-list";
    private String addCategory = "category/add-category";
    private String redirectCategory = "redirect:/category/category-list";

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("cat", categoryRepo.findAll());
        return categoryList;
    }

    @GetMapping("/add")
    public String add(Model model, Product product) {
        Category category = new Category();
        List<Product> products = productRepo.findAll();
        model.addAttribute("allProd", products);
        model.addAttribute("cat", category);
        return addCategory;
    }

    @PostMapping("/save")
    public String save(Category category, @RequestParam List<Long> products) {
        categoryRepo.save(category);
        Iterable<Product> productIterable = productRepo.findAllById(products);
        for (Product product : productIterable) {
            product.setCategory(category);
            productRepo.save(product);
        }
        return redirectCategory;
    }

}
