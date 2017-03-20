package com.yulartech.app;

import com.yulartech.domain.ImmutableBlog;

/**
 * Created by ybc on 3/20/17.
 */
public class App {

    public static void main(String args[]){
        ImmutableBlog blog = ImmutableBlog.builder()
                .blogAuthor(" Yular ")
                .blogTitle(" Java Immutable Objects QuickStart ")
                .blogDate(" 2017-03-20 ")
                .blogLink(" http://yular.github.io/2017/03/20/Java-Immutable-Objects-QuickStart/ ")
                .blogSummary(" A quickstart tutorial about Java immutable objects ")
                .build();

        System.out.println(blog);
    }
}
