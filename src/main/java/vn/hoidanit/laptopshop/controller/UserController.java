package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.hoidanit.laptopshop.service.UserService;

@Controller
public class UserController {
  private UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/")
  public String getHomePage(Model model) {
    String data = userService.getData();
    model.addAttribute("data", data);
    return "home";
  }

  @GetMapping("/admin/user")

  public String getCreateUserPage(Model model) {
    return "admin/user/create";
  }

}
