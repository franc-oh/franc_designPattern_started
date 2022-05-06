package com.franc.design._03_behavioral._16_iterator;

public class Post {
    private int seq; // 글번호
    private String content; // 내용

    public Post(int seq, String content) {
        this.seq = seq;
        this.content = content;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
