package project.firstSpring.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import project.firstSpring.AppConfig;
import project.firstSpring.member.Grade;
import project.firstSpring.member.Member;
import project.firstSpring.member.MemberService;

public class OrderApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
  //      MemberService memberService = appConfig.memberService();
    //    OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService",OrderService.class);


        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",300000);

        System.out.println("order : " + order);
        System.out.println("order.calcutatePrice : " + order.calculatePrice());
    }
}
