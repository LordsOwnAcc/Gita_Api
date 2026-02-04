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
    private File getWritableFile() throws IOException {
        File file = new File("src/main/resources/Data/shlok1.json");

        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
            mapper.writeValue(file, new ArrayList<Shlok>());
        }
        return file;
    }

    @Override
    public int addShlok(Shlok shlok) {
        try{
           File file = getWritableFile();
            List<Shlok> shloks;
           if(file.length()==0){
              shloks = new ArrayList<>();
           }else {
               shloks = mapper.readValue(
                       file,
                       new TypeReference<List<Shlok>>() {}
               );
           }
           shloks.add(shlok);
            mapper.writeValue(file, shloks);


 return 1;


        } catch (Exception e) {
            throw new RuntimeException(e);

        }

    }

    @Override
    public List<Shlok> getAll() {
        try {

            File file = getWritableFile();
            List<Shlok> shloks;
            if (file.length()==0){
                shloks = new ArrayList<>();
            }else {
                shloks=mapper.readValue(
                        file,
                        new TypeReference<List<Shlok>>(){}
                );
            }
            return shloks;
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public Shlok getShloksByNumber(int chapter,int verse) {
        try {

            File file = getWritableFile();
            List<Shlok> shloks;
            if (file.length()==0){
                shloks = new ArrayList<>();
            }else {
                shloks=mapper.readValue(
                        file,
                        new TypeReference<List<Shlok>>(){}
                );
            }
            return shloks.stream().filter(shlok -> (shlok.getVerse()==verse&&shlok.getChapter()==chapter)).findFirst().orElse(null);

        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Shlok> getShloksByChapter(int chapter) {
       try {
           File file = getWritableFile();
           List<Shlok> shloks;
           if (file.length()==0){
               shloks = new ArrayList<>();
               return shloks;
           }else {
               shloks=mapper.readValue(file,
                       new TypeReference<List<Shlok>>(){});
               return shloks.stream().filter(verse->(verse.getChapter()==chapter)).toList();
           }


       }catch (Exception e){
           throw new RuntimeException(e);
       }
    }
}

