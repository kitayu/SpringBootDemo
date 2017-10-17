package com.kitayu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * デモ用のRestコントローラです。
 */
@RestController
public class HelloWorldController {

	/**
	 * 文字列"Hello World!"を返却します。
	 * @return "Hello World!"
	 */
	@RequestMapping("/")
	String hello() {
		return "Hello World!";
	}
}
