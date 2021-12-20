package com.forum.forum393;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Question;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Forum393ApplicationTests {

	@Test
	void contextLoads() {
		Question question = new Question();
		question.setTitle("1.soru");
		question.setDescription("asdasda");
		Answer answer = new Answer();
		
	}

}
