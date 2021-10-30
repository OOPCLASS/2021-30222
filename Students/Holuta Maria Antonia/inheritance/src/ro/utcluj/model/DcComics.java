package ro.utcluj.model;

import ro.utcluj.model.Comics;

public class DcComics extends Comics {

    private String coWriter;

    public String getCoWriter() {
        return coWriter;
    }

    public void setCoWriter(String coWriter) {
        this.coWriter = coWriter;
    }

    @Override
    public String getCoWriterIfExists() {
        return coWriter;
    }

}
