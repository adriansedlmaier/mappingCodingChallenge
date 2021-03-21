package com.mhp.coding.challenges.mapping.exceptions;

public class ArticleNotFoundException extends RuntimeException {

    public ArticleNotFoundException (long id) {
        super("The article with the id " + id + " was not found.");
    }
}
