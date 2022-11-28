package servletTest.servlet.repository;

import servletTest.servlet.domain.member.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemberRepository { // 싱글톤으로 생성

    private HashMap<Long, Member> store = new HashMap<>();
    private Long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance(){
        return instance;
    }

    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public void clearStore() {
        store.clear();
    }
}
