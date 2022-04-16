package com.franc.design._02_structural._09_decorator._02_after;


/** 클라이언트 */
public class Client {

    // ==================================
    // #1. 클라이언트 코드
    // ==================================
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }


    // ==================================
    // #2. 호출 (편의를 위해 메인 메소드로 처리)
    // ==================================
    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();     // 1. 고유 기능으로 인스턴스 생성
        commentService = new SpamFilterCommentDecorator(commentService); // 2. 스팸필터 기능추가
        commentService = new CleanCommentDecorator(commentService);      // 3. 악플필터 기능추가

        Client client = new Client(commentService);
        client.writeComment("승리호 감상평");
        client.writeComment("노잼..."); // => 악플필터 검열
        client.writeComment("평점 : ★★");
        client.writeComment("제작사 : http://www.netflix.com"); // => 스팸필터 검열
    }
}
