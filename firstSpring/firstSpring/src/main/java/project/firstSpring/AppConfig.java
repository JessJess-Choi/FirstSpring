package project.firstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.firstSpring.discount.DiscountPolicy;
import project.firstSpring.discount.RateDiscountPolicy;
import project.firstSpring.member.MemberService;
import project.firstSpring.member.MemberServiceImpl;
import project.firstSpring.member.MemoryMemberRepository;
import project.firstSpring.order.OrderService;
import project.firstSpring.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
 //       return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
