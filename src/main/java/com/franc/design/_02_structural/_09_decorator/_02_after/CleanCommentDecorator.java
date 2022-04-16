package com.franc.design._02_structural._09_decorator._02_after;

/** 악플 필터링 서비스 => Concrete Decorator */
public class CleanCommentDecorator extends CommentDecorator {

    public CleanCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        boolean isBad = isBad(comment);
        if (!isBad) {
            super.addComment(comment);
        }
    }

    private boolean isBad(String comment) {
        return comment.contains("노잼");
    }
}
