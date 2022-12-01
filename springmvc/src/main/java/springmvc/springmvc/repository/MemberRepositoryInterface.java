package springmvc.springmvc.repository;

import springmvc.springmvc.domain.Member;

import java.util.List;

public interface MemberRepositoryInterface {

    Member save(Member member);

    Member findById(Long id);

    List<Member> findAll();

    List<Member> deleteMember(Member member);

    void update(Long memberId, Member member);

    void clearStore();
}
