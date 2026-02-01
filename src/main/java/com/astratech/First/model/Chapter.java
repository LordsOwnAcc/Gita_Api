package com.astratech.First.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chapter {

    private int chapter_number;
    private int verses_count;
    private String name;

    private String image;
    private String translation;
    private String transliteration;
    private Meaning meaning;
    private Summary summary;

  public Chapter(@JsonProperty("chapter_number") int chapter_number,
           @JsonProperty("verses_count")  int verses_count,
           @JsonProperty("name") String name,
           @JsonProperty("image") String image,
           @JsonProperty("translation") String translation,
           @JsonProperty("transliteration") String transliteration,
           @JsonProperty("meaning") Meaning meaning,
           @JsonProperty("summary") Summary summary) {
        this.chapter_number = chapter_number;
        this.verses_count = verses_count;
        this.name = name;
        this.image = image;
        this.translation = translation;
        this.transliteration = transliteration;
        this.meaning = meaning;
        this.summary = summary;
    }

    // Getters and Setters
    public int getChapter_number() {
        return chapter_number;
    }

    public void setChapter_number(int chapter_number) {
        this.chapter_number = chapter_number;
    }

    public int getVerses_count() {
        return verses_count;
    }

    public void setVerses_count(int verses_count) {
        this.verses_count = verses_count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public Meaning getMeaning() {
        return meaning;
    }

    public void setMeaning(Meaning meaning) {
        this.meaning = meaning;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}

