package com.franc.design._03_behavioral._16_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** [ConcreteAggregate] Post 객체의 집합체 */
public class Board {
    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    // Post를 추가
    public void addPost(int seq, String content) {
        this.posts.add(new Post(seq, content));
    }

    // #1. 이터레이터를 통한 순회 (최신 글번호 순으로 순회)
    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }

}
