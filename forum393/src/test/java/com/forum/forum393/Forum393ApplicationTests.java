package com.forum.forum393;

import com.forum.forum393.dto.QuestionDTO;
import com.forum.forum393.model.*;
import com.forum.forum393.repository.QuestionRepo;
import com.forum.forum393.service.AnswerService;
import com.forum.forum393.service.CommentService;
import com.forum.forum393.service.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import javax.transaction.Transactional;
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

	@Autowired
	QuestionRepo questionRepo;



	@Test
	@Transactional
	@Commit
	void contextLoads() {
		User user = new User();
		User user2 = new User();
		user.setName("umut");
		user2.setName("deniz");



		Question question = new Question();
		question.setTitle("1.soru");
		question.setDescription("question 1");
		question.setAskedDate("22.06.2020");
	 	question.setUser(user);
		question.setViewCount(5);
		question.setVoteCount(6);

		Question question2 = new Question();
		question2.setTitle("2.soru");
		question2.setDescription("question 2");
		question2.setAskedDate("27.06.2020");
		//	question2.setOwner(user);
		question2.setViewCount(7);
		question2.setVoteCount(8);
		List<Question> questions = new ArrayList<>();
		questions.add(question);
		questions.add(question2);




		Answer answer = new Answer();
		Answer answer2 = new Answer();
		Answer answer3 = new Answer();
		List<Answer> answers = new ArrayList<>();
		answers.add(answer);
		answers.add(answer2);
		answers.add(answer3);
		answer.setQuestion(question);
		answer2.setQuestion(question);
		answer3.setQuestion(question);

		question.setAnswerCount(answers.size());
		question.setAnswers(answers);


		Comment comment = new Comment();
		Comment comment2 = new Comment();
		Comment comment3 = new Comment();
		List<Comment> comments = new ArrayList<>();
		comments.add(comment);
		comments.add(comment2);
		comments.add(comment3);

		question.setComments(comments);

		comment.setText("comment 1 is this");
		comment2.setText("comment 2 is this");
		comment3.setText("comment 3 is  this");


		comment.setQuestion(question);
		comment2.setQuestion(question);
		comment3.setQuestion(question);

		comment.setAnswer(answer);
		comment2.setAnswer(answer2);
		comment3.setAnswer(answer3);

		comment.setDate("23.06.2020");
		comment2.setDate("24.06.2020");
		comment3.setDate("25.06.2020");

		comment.setWriter(user);
		comment2.setWriter(user);
		comment3.setWriter(user2);

		user.setAnswers(answers);
		user.setComments(comments);
		user.setQuestions(questions);


		Tag tag = new Tag();
		Tag tag2 = new Tag();
		tag.setId(1);
		tag.setQuestions(questions);
		tag2.setId(2);
		tag2.setQuestions(questions);





		questionRepo.save(question);
		questionRepo.save(question2);
	//	questionService.save(question);
	//	questionService.save(question2);
	//	answerService.save(answer);
	//	commentService.save(comment);



	}

}
