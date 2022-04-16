package com.franc.design._02_structural._09_decorator._02_after;

/** 기본적인 영화댓글 서비스 => Concrete Component */
public class DefaultCommentService implements CommentService {
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
