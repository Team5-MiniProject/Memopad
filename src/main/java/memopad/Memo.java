package memopad;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memo {

    private String name;
    private int psw;
    private String content;
    private String memoDate;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Memo (String name, int psw, String content){
        this.name = name;
        this.psw = psw;
        this.content=content;
        this.memoDate = formatter.format(LocalDateTime.now());
    }

    public String toString(){
        return name +"    "+ content+"    "+memoDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPsw() {
        return psw;
    }

    public void setPsw(int psw) {
        this.psw = psw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMemoDate() {
        return memoDate;
    }

    public void setMemoDate(String memoDate) {
        this.memoDate = memoDate;
    }

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }
}