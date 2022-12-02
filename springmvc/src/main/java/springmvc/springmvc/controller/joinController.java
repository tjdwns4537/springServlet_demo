package springmvc.springmvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springmvc.springmvc.domain.Member;
import springmvc.springmvc.repository.MemberRepositoryInterface;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/join")
@RequiredArgsConstructor
public class joinController {

    private final MemberRepositoryInterface memberRepository;

    @PostMapping("/login")
    public String login(
            @RequestParam String id,
            @RequestParam String pw
                        ) {
        return "/join/login";
    }

    @GetMapping("/memberView")
    public String memberListView(Model model) { // 회원 목록 조회
        List<Member> members = memberRepository.findAll();
        model.addAttribute("members", members);
        log.info("log : {}" + model.getAttribute("members"));

        return "/join/memberView";
    }

    @PostConstruct
    public void init() { // 테스트용 멤버 데이터 넣기
        memberRepository.save(new Member("성준","tjdwns", "1234", 010));
        memberRepository.save(new Member("수진","sujin", "2345", 011));
        memberRepository.save(new Member("성형","tjdgud", "0101", 533));
    }

    @GetMapping("/memberView/{id}")
    public String item(@PathVariable Long id, Model model) {
        Member findMember = memberRepository.findById(id);
        model.addAttribute("member", findMember);
        return "/join/member";
    }
}
