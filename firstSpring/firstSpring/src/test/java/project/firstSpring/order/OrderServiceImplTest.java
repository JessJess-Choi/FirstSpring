package project.firstSpring.order;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import project.firstSpring.discount.FixDiscountPolicy;
import project.firstSpring.member.Grade;
import project.firstSpring.member.Member;
import project.firstSpring.member.MemoryMemberRepository;

public class OrderServiceImplTest {

    @Test
    void createOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L,"name", Grade.VIP));

        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository,new FixDiscountPolicy());
        Order order = orderService.createOrder(1L,"itemA",10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
