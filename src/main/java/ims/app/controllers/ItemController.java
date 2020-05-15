package ims.app.controllers;

import ims.app.dao.ItemRepo;
import ims.app.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemRepo itemRepo;

    @GetMapping("/new")
    public String newItem(Model model) {
        Item item = new Item();
        model.addAttribute("item", item);
        return "item/new-item";
    }

    @PostMapping("/save")
    public String saveItem(Item item) {
    itemRepo.save(item);
    return "redirect:/item/new";
    }
}
