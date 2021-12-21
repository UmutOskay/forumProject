package com.forum.forum393;

import com.forum.forum393.model.Answer;
import com.forum.forum393.model.Comment;
import com.forum.forum393.model.Question;
import com.forum.forum393.service.AnswerService;
import com.forum.forum393.service.CommentService;
import com.forum.forum393.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Forum393ApplicationTests {
	@Autowired
	QuestionService questionService;

	@Autowired
	AnswerService answerService;

	@Autowired
	CommentService commentService;

	@Test
	void contextLoads() {
		Question question = new Question();
		question.setTitle("1.soru");
		question.setDescription("asdasda");
		question.setAskedDate("22.06.2020");


		Answer answer = new Answer();
		Answer answer2 = new Answer();
		Answer answer3 = new Answer();
		List<Answer> answers = new ArrayList<>();
		answers.add(answer);
		answers.add(answer);
		answers.add(answer);
		answer.setQuestion(question);

		Comment comment = new Comment();
		Comment comment2 = new Comment();
		Comment comment3 = new Comment();
		List<Comment> comments = new ArrayList<>();
		comments.add(comment);
		comments.add(comment2);
		comments.add(comment3);

		questionService.save(question);
		answerService.save(answer);
		commentService.save(comment);



		answer.setQuestion(question);
	}

}
