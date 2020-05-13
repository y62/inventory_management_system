package ims.app.controllers;

import ims.app.dao.BatchRepo;
import ims.app.entities.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    BatchRepo batchRepo;

    @GetMapping("/new")
    public String newBatch(Model model) {
        Batch batch = new Batch();
        model.addAttribute("batch", batch);
        return "batch/new-batch";
    }
}
