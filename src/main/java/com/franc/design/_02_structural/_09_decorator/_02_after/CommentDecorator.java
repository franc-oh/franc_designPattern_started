package com.franc.design._02_structural._09_decorator._02_after;

/** 영화댓글에 대한 부가기능 담당 => Decorator */
public class CommentDecorator implements CommentService {

    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
