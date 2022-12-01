package springmvc.springmvc.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {

    private Long id;
    private String memberId;
    private String memberPassword;
    private int phoneNumber;

    public Member(String memberId, String memberPassword, int phoneNumber) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.phoneNumber = phoneNumber;
    }
}
