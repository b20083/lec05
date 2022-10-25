package oit.is.sannomiya.lec05.lec05.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import oit.is.sannomiya.lec05.lec05.model.Fruit;
//import oit.is.sannomiya.lec05.lec05.model.FruitMapper;

/**
 * /sample5へのリクエストを扱うクラス authenticateの設定をしていれば， /sample5へのアクセスはすべて認証が必要になる
 */
@Controller
@RequestMapping("/sample5")
public class Sample51Controller {

  // @Autowired
  // FruitMapper fMapper;

  @GetMapping("step1")
  public String sample51() {
    return "sample51.html";
  }
}