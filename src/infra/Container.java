package infra;

import controller.ArticleController;
import controller.Controller;
import controller.MemberController;
import controller.SystemController;
import data.Member;
import repository.ArticleRepository;
import repository.MemberRepository;
import service.ArticleService;
import service.MemberService;

import java.util.Scanner;

public class Container {

    public static Scanner sc;
    public static Session session;

    // repository
    public static MemberRepository memberRepository;
    public static ArticleRepository articleRepository;


    // service
    public static MemberService memberService;
    public static ArticleService articleService;


    // controller
    public static SystemController systemController;
    public static MemberController memberController;
    public static ArticleController articleController;


    static {
        sc = new Scanner(System.in);
        session = new Session();

        memberRepository = new MemberRepository();
        articleRepository = new ArticleRepository();
        memberService = new MemberService();
        articleService = new ArticleService();
        memberController = new MemberController();
        systemController = new SystemController();
        articleController = new ArticleController();

    }

}
