package com.astratech.First.dao;

import com.astratech.First.model.Chapter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;



@Repository
@Qualifier("jsonDao")
public class JsonChapterDataAccessService implements ChapterDao {

    private final ObjectMapper mapper = new ObjectMapper();

    private InputStream getFile() {
        InputStream inputStream = getClass()
                .getClassLoader()
                .getResourceAsStream("Data/chapters.json");

        if (inputStream == null) {
            throw new RuntimeException("chapters.json not found");
        }
        return inputStream;
    }

    @Override
    public int addChapter(Chapter chapter) {
        throw new UnsupportedOperationException(
                "Cannot write to bundled JSON in production"
        );
    }

    @Override
    public List<Chapter> getChapters() {
        try {
            return mapper.readValue(
                    getFile(),
                    new TypeReference<List<Chapter>>() {}
            );
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Chapter getChapter(int chapterNumber) {
        return getChapters()
                .stream()
                .filter(c -> c.getChapter_number() == chapterNumber)
                .findFirst()
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND)
                );
    }

    @Override
    public List<Chapter> queryChaptersByName(String name) {
        return getChapters()
                .stream()
                .filter(c ->
                        c.getSummary().getEn()
                                .toLowerCase()
                                .contains(name.toLowerCase())
                )
                .toList();
    }
}
