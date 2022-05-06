package com.franc.design._03_behavioral._16_iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // 집합체 Board에 글 저장
        Board board = new Board();
        board.addPost(1,"1번 글");
        board.addPost(2,"2번 글");
        board.addPost(3,"3번 글");

        /*
        List<Post> posts = board.posts;

        // #1. 클라이언트가 직접 순회 - 순차적으로 순회
        for(Post post : posts) {
            System.out.println(post.getContent());
        }
        System.out.println("=======================");

        // #2. 클라이언트가 직접 순회 - 최신 글번호 순으로 순회
        Collections.sort(posts, (p1, p2) -> p2.getSeq() > p1.getSeq() ? 1 : -1);
        for(Post post : posts) {
            System.out.println(post.getContent());
        }
        System.out.println("=======================");*/

        // #3. Iterator 사용 - 최신 글번호 순으로 순회
        Iterator<Post> itPosts = board.getRecentPostIterator();
        while (itPosts.hasNext()) {
            System.out.println(itPosts.next().getContent());
        }
    }
}
