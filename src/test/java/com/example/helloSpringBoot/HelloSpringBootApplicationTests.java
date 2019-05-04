package com.example.helloSpringBoot;

import com.cohesion.rest.controller.IndexController;
import jdk.net.SocketFlow;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloSpringBootApplicationTests {

	private MockMvc mvc;
//
//	@Before
//	public void before(){
//		this.mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
//	}
//
//	@Test
//	public void contextLoads() throws Exception {
//		RequestBuilder req = get("/index");
//		mvc.perform(req).andExpect(status().isOk()).andExpect(MockMvcResultMatchers.content().string("hello world"));
//
//	}

}
