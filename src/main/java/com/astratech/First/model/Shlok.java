package com.astratech.First.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Shlok {

   // private String _id;
    private int chapter;
    private int verse;
    private String slok;
    private String transliteration;


    private Map<String, Object> tej;
    private Map<String, Object> siva;
    private Map<String, Object> purohit;
    private Map<String, Object> chinmay;
    private Map<String, Object> san;
    private Map<String, Object> adi;
    private Map<String, Object> gambir;
    private Map<String, Object> madhav;
    private Map<String, Object> anand;
    private Map<String, Object> rams;
    private Map<String, Object> raman;
    private Map<String, Object> abhinav;
    private Map<String, Object> sankar;
    private Map<String, Object> jaya;
    private Map<String, Object> vallabh;
    private Map<String, Object> ms;
    private Map<String, Object> srid;
    private Map<String, Object> dhan;
    private Map<String, Object> venkat;
    private Map<String, Object> puru;
    private Map<String, Object> neel;
    private Map<String, Object> prabhu;
    public Shlok(
          //  @JsonProperty("shlokNumber") int shlokNumber,
            @JsonProperty("chapter") int chapter,
            @JsonProperty("verse") int verse,
            @JsonProperty("slok") String slok,
            @JsonProperty("transliteration") String transliteration,

            @JsonProperty("tej") Map<String, Object> tej,
            @JsonProperty("siva") Map<String, Object> siva,
            @JsonProperty("purohit") Map<String, Object> purohit,
            @JsonProperty("chinmay") Map<String, Object> chinmay,
            @JsonProperty("san") Map<String, Object> san,
            @JsonProperty("adi") Map<String, Object> adi,
            @JsonProperty("gambir") Map<String, Object> gambir,
            @JsonProperty("madhav") Map<String, Object> madhav,
            @JsonProperty("anand") Map<String, Object> anand,
            @JsonProperty("rams") Map<String, Object> rams,
            @JsonProperty("raman") Map<String, Object> raman,
            @JsonProperty("abhinav") Map<String, Object> abhinav,
            @JsonProperty("sankar") Map<String, Object> sankar,
            @JsonProperty("jaya") Map<String, Object> jaya,
            @JsonProperty("vallabh") Map<String, Object> vallabh,
            @JsonProperty("ms") Map<String, Object> ms,
            @JsonProperty("srid") Map<String, Object> srid,
            @JsonProperty("dhan") Map<String, Object> dhan,
            @JsonProperty("venkat") Map<String, Object> venkat,
            @JsonProperty("puru") Map<String, Object> puru,
            @JsonProperty("neel") Map<String, Object> neel,
            @JsonProperty("prabhu") Map<String, Object> prabhu
    ) {
//        this.shlokNumber = shlokNumber;
        this.chapter = chapter;
        this.verse = verse;
        this.slok = slok;
        this.transliteration = transliteration;

        this.tej = tej;
        this.siva = siva;
        this.purohit = purohit;
        this.chinmay = chinmay;
        this.san = san;
        this.adi = adi;
        this.gambir = gambir;
        this.madhav = madhav;
        this.anand = anand;
        this.rams = rams;
        this.raman = raman;
        this.abhinav = abhinav;
        this.sankar = sankar;
        this.jaya = jaya;
        this.vallabh = vallabh;
        this.ms = ms;
        this.srid = srid;
        this.dhan = dhan;
        this.venkat = venkat;
        this.puru = puru;
        this.neel = neel;
        this.prabhu = prabhu;
    }
//    public String get_shlokNumber() {
//        return _id;
//    }

  //  public void set_shlokNumber(String _id) {
//        this._id = _id;
//    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getVerse() {
        return verse;
    }

    public void setVerse(int verse) {
        this.verse = verse;
    }

    public String getSlok() {
        return slok;
    }

    public void setSlok(String slok) {
        this.slok = slok;
    }

    public String getTransliteration() {
        return transliteration;
    }

    public void setTransliteration(String transliteration) {
        this.transliteration = transliteration;
    }

    public Map<String, Object> getTej() {
        return tej;
    }

    public void setTej(Map<String, Object> tej) {
        this.tej = tej;
    }

    public Map<String, Object> getSiva() {
        return siva;
    }

    public void setSiva(Map<String, Object> siva) {
        this.siva = siva;
    }

    public Map<String, Object> getPurohit() {
        return purohit;
    }

    public void setPurohit(Map<String, Object> purohit) {
        this.purohit = purohit;
    }

    public Map<String, Object> getChinmay() {
        return chinmay;
    }

    public void setChinmay(Map<String, Object> chinmay) {
        this.chinmay = chinmay;
    }

    public Map<String, Object> getSan() {
        return san;
    }

    public void setSan(Map<String, Object> san) {
        this.san = san;
    }

    public Map<String, Object> getAdi() {
        return adi;
    }

    public void setAdi(Map<String, Object> adi) {
        this.adi = adi;
    }

    public Map<String, Object> getGambir() {
        return gambir;
    }

    public void setGambir(Map<String, Object> gambir) {
        this.gambir = gambir;
    }

    public Map<String, Object> getMadhav() {
        return madhav;
    }

    public void setMadhav(Map<String, Object> madhav) {
        this.madhav = madhav;
    }

    public Map<String, Object> getAnand() {
        return anand;
    }

    public void setAnand(Map<String, Object> anand) {
        this.anand = anand;
    }

    public Map<String, Object> getRams() {
        return rams;
    }

    public void setRams(Map<String, Object> rams) {
        this.rams = rams;
    }

    public Map<String, Object> getRaman() {
        return raman;
    }

    public void setRaman(Map<String, Object> raman) {
        this.raman = raman;
    }

    public Map<String, Object> getAbhinav() {
        return abhinav;
    }

    public void setAbhinav(Map<String, Object> abhinav) {
        this.abhinav = abhinav;
    }

    public Map<String, Object> getSankar() {
        return sankar;
    }

    public void setSankar(Map<String, Object> sankar) {
        this.sankar = sankar;
    }

    public Map<String, Object> getJaya() {
        return jaya;
    }

    public void setJaya(Map<String, Object> jaya) {
        this.jaya = jaya;
    }

    public Map<String, Object> getVallabh() {
        return vallabh;
    }

    public void setVallabh(Map<String, Object> vallabh) {
        this.vallabh = vallabh;
    }

    public Map<String, Object> getMs() {
        return ms;
    }

    public void setMs(Map<String, Object> ms) {
        this.ms = ms;
    }

    public Map<String, Object> getSrid() {
        return srid;
    }

    public void setSrid(Map<String, Object> srid) {
        this.srid = srid;
    }

    public Map<String, Object> getDhan() {
        return dhan;
    }

    public void setDhan(Map<String, Object> dhan) {
        this.dhan = dhan;
    }

    public Map<String, Object> getVenkat() {
        return venkat;
    }

    public void setVenkat(Map<String, Object> venkat) {
        this.venkat = venkat;
    }

    public Map<String, Object> getPuru() {
        return puru;
    }

    public void setPuru(Map<String, Object> puru) {
        this.puru = puru;
    }

    public Map<String, Object> getNeel() {
        return neel;
    }

    public void setNeel(Map<String, Object> neel) {
        this.neel = neel;
    }

    public Map<String, Object> getPrabhu() {
        return prabhu;
    }

    public void setPrabhu(Map<String, Object> prabhu) {
        this.prabhu = prabhu;
    }
}

