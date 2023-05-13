package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //중요!!!
public class HelloController {

    @GetMapping("hello") //webApplication에서 /hello라고 들어오면 이 메서드를 호출해줌
    public String hello(Model model) {
        model.addAttribute("data", "hello!!!");
        return "hello"; //resources/templates 밑에 있는 hello를 찾음
    }


    @GetMapping("hello-mvc") //이번엔 name을 url파라미터에서 받아올것임.,model을 꼭 넣어줘야함!! model에 담으면 그걸 view에서 렌더링 할떄 씀
    public String helloMvc(@RequestParam("name") String name, Model model) { //ctrl +shfit + enter 자동완성
        model.addAttribute("name",name);
        return "hello-template";
    }

}
