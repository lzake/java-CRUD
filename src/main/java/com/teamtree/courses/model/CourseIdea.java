package com.teamtree.courses.model;

public class CourseIdea {
    private String title;
    private String creater;

    public CourseIdea(String title, String creater) {
        this.title = title;
        this.creater = creater;
    }

    public String getTitle() {
        return title;
    }

    public String getCreater() {
        return creater;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CourseIdea that = (CourseIdea) o;

        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return creater != null ? creater.equals(that.creater) : that.creater == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (creater != null ? creater.hashCode() : 0);
        return result;
    }
}
