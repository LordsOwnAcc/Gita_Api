package com.astratech.First.dao;

import com.astratech.First.model.Chapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ChapterDao {

    int addChapter(Chapter chapter);
List<Chapter> getChapters();

Chapter getChapter(int chapterNumber);

List<Chapter> queryChaptersByName(String name);

}
