package springmvc.springmvc.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Member {

    private Long id;
    private String memberName;
    private String memberId;
    private String memberPassword;
    private int phoneNumber;

    public Member(String memberName, String memberId, String memberPassword, int phoneNumber) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.phoneNumber = phoneNumber;
    }
}
