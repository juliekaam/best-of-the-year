package org.learning.bestofthe;

public class Song {
    private int id;
    private String title;

    public Song(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Song() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
