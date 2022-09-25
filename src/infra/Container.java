package infra;

import controller.Controller;
import controller.MemberController;
import controller.SystemController;
import data.Member;
import repository.MemberRepository;
import service.MemberService;

import java.util.Scanner;

public class Container {

    public static Scanner sc;
    public static Session session;

    // repository
    public static MemberRepository memberRepository;

    // service
    public static MemberService memberService;

    // controller
    public static SystemController systemController;
    public static MemberController memberController;

    static {
        sc = new Scanner(System.in);
        session = new Session();

        memberRepository = new MemberRepository();
        memberService = new MemberService();
        memberController = new MemberController();
        systemController = new SystemController();
    }

}
