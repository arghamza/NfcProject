package com.example.projetnfc.model;

public class TagContent {
    private TagType type;
    private String content;

    public TagContent(String content, TagType type) {
        this.type = type;
        this.content = content;
    }

    public TagType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}
