package ims.app.controllers;

import ims.app.dao.ProductRepo;
import ims.app.entities.Product;
import ims.app.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    private String productList = "product/product-list";
    private String addProduct = "product/add-product";
    private String redirectProduct = "redirect:/product/list";

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("prod", productRepo.findAll());
        return productList;
    }

    @GetMapping("/add")
    public String add(Model model) {
        Product product = new Product();
        model.addAttribute("prod", product);
        return addProduct;
    }

    @PostMapping("/save")
    public String save(Product product) {
        productRepo.save(product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") Product product) {
        productRepo.delete(product);
        return "redirect:/product/list";
    }
}
