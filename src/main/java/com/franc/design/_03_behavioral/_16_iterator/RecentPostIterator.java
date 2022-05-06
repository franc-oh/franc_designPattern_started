package com.franc.design._03_behavioral._16_iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/** 최신 등록순번 순으로 순회 */

// #1. Iterator의 구현체
public class RecentPostIterator implements Iterator<Post> {
    private Iterator<Post> internalIterator; // #2. 순회를 담기 위한 Iterator 필드

    // #3. 최신 등록순번 순으로 정렬 후 필드에 담는다.
    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getSeq() > p1.getSeq() ? 1 : -1);
        this.internalIterator = posts.iterator();
    }

    // #4. Iterator 메소드 재정의 (클라이언트는 이 2개의 메소드로만 순회를 사용한다.)
    // => 클라이언트는 내부구조를 몰라도 Iterator 메소드로만 순회를 사용할 수 있다.
    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
