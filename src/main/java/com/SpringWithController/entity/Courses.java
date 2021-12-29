package com.SpringWithController.entity;

public class Courses {
    private long id;
    private  String title;
    private String description;
/*
* Parametrized Constructor
 */
    public Courses(final long id, final String title,
                   final String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    /*
     * constructor
     */
    public Courses() {
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(final long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(final String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(final String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Courses{" + "id=" + id
                + ", title='" + title + '\''
                + ", description='" + description + '\'' + '}';
    }
}
