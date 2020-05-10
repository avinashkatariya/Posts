package com.example.posts;

public class PostModel {
   private String _postHeading,_postContent,_author,_postDate,_imageUrl;

    public PostModel(String postHeading, String postContent, String author, String postDate, String imageUrl) {
        this._postHeading = postHeading;
        this._postContent = postContent;
        this._author = author;
        this._postDate = postDate;
        this._imageUrl = imageUrl;
    }

    public String get_postHeading() {
        return _postHeading;
    }

    public String get_postContent() {
        return _postContent;
    }

    public String get_author() {
        return _author;
    }

    public String get_postDate() {
        return _postDate;
    }

    public String get_imageUrl() {
        return _imageUrl;
    }
}
