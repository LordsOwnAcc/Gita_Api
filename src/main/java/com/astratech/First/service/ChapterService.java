package com.astratech.First.service;

import com.astratech.First.dao.ChapterDao;
import com.astratech.First.model.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {
private final ChapterDao chapterDao;

     @Autowired
    public ChapterService(@Qualifier("jsonDao") ChapterDao chapterDao) {
        this.chapterDao = chapterDao;
    }
    public int addChapter(Chapter chapter) {
        return chapterDao.addChapter(chapter);
    }
    public List<Chapter> getChapters() {
         return chapterDao.getChapters();
    }
    public Chapter getChapter(int chapterNumber) {
        return chapterDao.getChapter(chapterNumber);
    }
    public List<Chapter> queryAllChapters(String name) {
        return chapterDao.queryChaptersByName(name);
    }

}
