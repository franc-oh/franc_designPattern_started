package com.franc.design._02_structural._09_decorator._01_before;

/** 스팸을 방지하기 위해 'http'가 포함된 댓글을 필터링한다. */
public class SpamFilterCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
