package com.franc.design._02_structural._09_decorator._01_before;

/** 악플 필터링 서비스 */
public class CleanCommentService extends SpamFilterCommentService {

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
