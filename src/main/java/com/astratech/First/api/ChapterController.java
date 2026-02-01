package com.astratech.First.api;

import com.astratech.First.dao.ChapterDao;
import com.astratech.First.model.Chapter;
import com.astratech.First.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("chapter")
@RestController
public class ChapterController {
    private final ChapterService chapterService;

    @Autowired
    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }
    @PostMapping
    public void addChapter(@RequestBody Chapter chapter) {
        chapterService.addChapter(chapter);

    }

    @GetMapping
    public List<Chapter> getChapters() {
        return chapterService.getChapters();
    }

    @GetMapping("/{chapterNumber}")
    public Chapter getChapter(@PathVariable int chapterNumber) {
        return chapterService.getChapter(chapterNumber);
    }

    @GetMapping("/query")
    public List<Chapter> getChaptersByName(@RequestParam String name) {
        return chapterService.queryAllChapters(name);
    }

}
