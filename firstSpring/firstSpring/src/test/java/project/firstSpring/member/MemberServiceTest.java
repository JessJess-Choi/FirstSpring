package project.firstSpring.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import project.firstSpring.AppConfig;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join(){
        //MemberService memberService = new MemberServiceImpl(memberRepository);
        Member member = new Member(1L,"memberA",Grade.VIP);
        Member memberFail = new Member(2L,"memberA",Grade.VIP);

        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        Assertions.assertThat(member).isEqualTo(findMember);
        Assertions.assertThat(memberFail).isNotEqualTo(findMember);
    }
}
