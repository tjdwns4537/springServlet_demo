package springmvc.springmvc.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import springmvc.springmvc.domain.Member;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryImpTest {

    MemberRepositoryInterface memberRepository = MemberRepositoryImp.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        Member member = new Member("tjdwns","tjdwns4537","1234",01074724537);
        Member saveMember = memberRepository.save(member);

        Assertions.assertThat(saveMember.getId()).isEqualTo(1L);
    }

    @Test
    void findById() {
        Member member = new Member("a", "tjdwns","50", 010);
        Member save = memberRepository.save(member);

        Member findMember = memberRepository.findById(member.getId());

        Assertions.assertThat(save).isEqualTo(findMember);
    }

    @Test
    void findAll() {
    }

    @Test
    void deleteMember() {
    }

    @Test
    void update() {
    }
}