package project.firstSpring;

import project.firstSpring.member.Grade;
import project.firstSpring.member.Member;
import project.firstSpring.member.MemberService;
import project.firstSpring.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L,"memberA", Grade.VIP);
        memberService.join(member);
        Member findMemeber = memberService.findMember(1L);
        System.out.println("newMember : " + findMemeber.getName());
        System.out.println("findMember : " + findMemeber.getName());

    }
}
