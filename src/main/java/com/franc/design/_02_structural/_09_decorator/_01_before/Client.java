package com.franc.design._02_structural._09_decorator._01_before;

/** 클라이언트 */
public class Client {
    // ==================================
    // #1. 클라이언트 코드
    // ==================================
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }


    // ==================================
    // #2. 호출 (편의를 위해 메인 메소드로 처리)
    // ==================================
    public static void main(String[] args) {
        // 고객은 영화에 대한 댓글을 남기며, 스팸방지를 위해 SpamFilter 모드를 사용한다.
        // 하지만 여기에 악플방지기능도 추가해야 된다면???
        Client client = new Client(new SpamFilterCommentService());
        client.writeComment("승리호 감상평");
        client.writeComment("노잼...");
        client.writeComment("평점 : ★★");
        client.writeComment("제작사 : http://www.netflix.com");
    }
}
