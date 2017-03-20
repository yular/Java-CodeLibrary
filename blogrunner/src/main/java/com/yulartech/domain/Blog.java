package com.yulartech.domain;

import org.immutables.value.Value;

@Value.Immutable
public abstract  class Blog {
    public abstract String blogAuthor();
    public abstract  String blogTitle();
    public abstract  String blogLink();
    public abstract String blogDate();
    public abstract String blogSummary();
}
