package com.astratech.First.service;

import com.astratech.First.dao.ShlokDao;
import com.astratech.First.model.Shlok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Shlok1Service {
    private final ShlokDao shlokDao;

    @Autowired
    public Shlok1Service(@Qualifier("shlok1Dao") ShlokDao shlokDao) {
        this.shlokDao = shlokDao;
    }
    public int addShlok(Shlok shlok) {
        return shlokDao.addShlok(shlok);
    }
    public List<Shlok> getAllShlok() {
        return shlokDao.getAll();
    }
    public Shlok getShlokById(int chapter,int verse) {
        return shlokDao.getShloksByNumber(chapter,verse);
    }
    public List<Shlok> getShlokByChapter(int chapter) {
        return shlokDao.getShloksByChapter(chapter);
    }


}
