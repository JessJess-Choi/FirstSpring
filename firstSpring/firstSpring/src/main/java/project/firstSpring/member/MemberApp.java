package project.firstSpring.member;

import project.firstSpring.AppConfig;

public class MemberApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member);
        Member findMemeber = memberService.findMember(1L);
        System.out.println("newMember : " + findMemeber.getName());
        System.out.println("findMember : " + findMemeber.getName());

    }
}
