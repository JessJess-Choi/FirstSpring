package project.firstSpring;

import project.firstSpring.discount.DiscountPolicy;
import project.firstSpring.discount.FixDiscountPolicy;
import project.firstSpring.discount.RateDiscountPolicy;
import project.firstSpring.member.MemberService;
import project.firstSpring.member.MemberServiceImpl;
import project.firstSpring.member.MemoryMemberRepository;
import project.firstSpring.order.OrderService;
import project.firstSpring.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
 //       return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
