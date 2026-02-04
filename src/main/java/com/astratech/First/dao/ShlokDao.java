package com.astratech.First.dao;

import com.astratech.First.model.Shlok;

import java.util.List;

public interface ShlokDao {

    int addShlok(Shlok shlok);
    List<Shlok> getAll();

   Shlok getShloksByNumber(int chapter,int verse);

   List<Shlok> getShloksByChapter(int chapter);



}
