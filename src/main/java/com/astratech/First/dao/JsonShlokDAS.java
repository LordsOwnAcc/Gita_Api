package com.astratech.First.dao;

import com.astratech.First.model.Shlok;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


@Repository
@Qualifier("shlok1Dao")
public class JsonShlokDAS implements ShlokDao {


    private final ObjectMapper mapper  = new ObjectMapper();
    private InputStream getFile() {
        InputStream inputStream = getClass()
                .getClassLoader()
                .getResourceAsStream("Data/shlok1.json");

        if (inputStream == null) {
            throw new RuntimeException("chapters.json not found");
        }
        return inputStream;
    }

    @Override
    public int addShlok(Shlok shlok) {
       throw  new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Shlok> getAll() {
        try {
            return mapper.readValue(
                    getFile(),
                    new TypeReference<List<Shlok>>() {}
            );
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public Shlok getShloksByNumber(int chapter,int verse) {
        try {
            List<Shlok> shloks=getAll();

            return shloks.stream().filter(shlok -> (shlok.getVerse()==verse&&shlok.getChapter()==chapter)).findFirst().orElse(null);

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Shlok> getShloksByChapter(int chapter) {
       try {

           List<Shlok> shloks=getAll();


               return shloks.stream().filter(verse->(verse.getChapter()==chapter)).toList();



       }catch (Exception e){
           throw new RuntimeException(e);
       }
    }
}

