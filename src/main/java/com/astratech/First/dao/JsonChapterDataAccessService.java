package com.astratech.First.dao;

import com.astratech.First.model.Chapter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;




@Repository
@Qualifier("jsonDao")
public class JsonChapterDataAccessService implements ChapterDao {

    private static final String FILE_PATH =
            "src/main/resources/Data/chapters.json";

    private static final String FILE_PATH_Shlok =
            "src/main/resources/Data/shlok1.json";

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public int addChapter(Chapter chapter) {
        try {
            List<Chapter> chapters = getChapters();
            chapters.add(chapter);
            mapper.writeValue(new File(FILE_PATH), chapters);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Chapter> getChapters() {
        try {
            File file = new File(FILE_PATH);

            if (!file.exists()) {
                return new ArrayList<>();
            }

            return mapper.readValue(
                    file,
                    new TypeReference<List<Chapter>>() {}
            );

        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public Chapter getChapter(int chapterNumber) {
        try {
            File file = new File(FILE_PATH);

            if (!file.exists()) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }

            Chapter result = mapper.readValue(
                    file,
                    new TypeReference<List<Chapter>>() {}
            ).stream().filter(chapter -> chapter.getChapter_number()==chapterNumber).findFirst().orElse(null);

            if (result == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }else {
                return result;
            }

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public List<Chapter> queryChaptersByName(String name) {
        try {
            File file = new File(FILE_PATH);

            if (!file.exists()) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }

            List<Chapter> result = mapper.readValue(
                    file,
                    new TypeReference<List<Chapter>>() {}
            ).stream().filter(chapter -> chapter.getSummary().getEn().contains(name)  ).toList();

            if (result == null) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND);
            }else {
                return result;
            }

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
