package project.firstSpring.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    @Test
    void join(){

        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"memberA",Grade.VIP);
        Member memberFail = new Member(2L,"memberA",Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
        Assertions.assertThat(memberFail).isNotEqualTo(findMember);
    }
}
