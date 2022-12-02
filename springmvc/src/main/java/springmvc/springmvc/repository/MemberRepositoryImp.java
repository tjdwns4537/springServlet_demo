package springmvc.springmvc.repository;

import org.springframework.stereotype.Repository;
import springmvc.springmvc.domain.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MemberRepositoryImp implements MemberRepositoryInterface {

    private static final MemberRepositoryInterface instance = new MemberRepositoryImp();
    private Long sequence = 0L;
    private HashMap<Long, Member> store = new HashMap<>();

    private MemberRepositoryImp() {

    }

    public static MemberRepositoryInterface getInstance(){
        return instance;
    }

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(sequence, member);
        return member;
    }

    @Override
    public Member findById(Long id) {
        return store.get(id);
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public List<Member> deleteMember(Member member) {
        store.remove(member.getId());
        return new ArrayList<>(store.values());
    }

    @Override
    public void update(Long memberId, Member member) {
        Member prevMember = findById(memberId);
        prevMember.setMemberName(member.getMemberName());
        prevMember.setMemberId(member.getMemberId());
        prevMember.setMemberPassword(member.getMemberPassword());
        prevMember.setPhoneNumber(member.getPhoneNumber());
    }

    @Override
    public void clearStore() {
        store.clear();
    }


}
