package com.astratech.First.api;

import com.astratech.First.model.Shlok;
import com.astratech.First.service.Shlok1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shlok")
public class Shlok1Controller {
private final Shlok1Service shlok1Service;

    @Autowired
    public Shlok1Controller(Shlok1Service shlok1Service) {
        this.shlok1Service = shlok1Service;
    }

    @PostMapping
    public int addShloks(@RequestBody Shlok shlok) {
        return shlok1Service.addShlok(shlok);
    }
    @GetMapping
    public List<Shlok> getShloks() {
        return shlok1Service.getAllShlok();
    }
    @GetMapping("/{chapter}/{verse}")
    public Shlok getShlokById(@PathVariable int chapter, @PathVariable int verse) {
        return shlok1Service.getShlokById(chapter,verse);
    }
    @GetMapping("/{chapter}")
    public List<Shlok> getShloksByChapter(@PathVariable int chapter) {
        return shlok1Service.getShlokByChapter(chapter);
    }


}


