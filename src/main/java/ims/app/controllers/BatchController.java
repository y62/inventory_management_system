package ims.app.controllers;

import ims.app.dao.BatchRepo;
import ims.app.dto.BatchObject;
import ims.app.entities.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/batch")
public class BatchController {

    @Autowired
    BatchRepo batchRepo;

    @GetMapping("/add")
    public String newBatch(Model model) {
        Batch batch = new Batch();
        model.addAttribute("batch", batch);
        return "batch/add-batch";
    }

    @PostMapping("/save")
    public String save(Batch batch) {
        batchRepo.save(batch);
        return "redirect:/batch/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<BatchObject> batchList = batchRepo.batches();
        model.addAttribute("batchList", batchList);
        return "batch/batch-list";
    }
}
