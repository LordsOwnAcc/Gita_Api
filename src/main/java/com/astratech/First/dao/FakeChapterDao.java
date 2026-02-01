package com.astratech.First.dao;

import com.astratech.First.model.Chapter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("fakeDao")
public class FakeChapterDao implements ChapterDao {

    public static List<Chapter> chapters=  new ArrayList<>();
    @Override
    public int addChapter(Chapter chapter) {
        chapters.add(chapter);
        return 1;
    }

    @Override
    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public Chapter getChapter(int chapterNumber) {
        return null;
    }

    @Override
    public List<Chapter> queryChaptersByName(String name) {
        return List.of();
    }

}
