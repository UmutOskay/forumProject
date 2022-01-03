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
		question2.setUser(user2);
		question2.setViewCount(7);
		question2.setVoteCount(8);

	/*	Question question3 = new Question();
		question.setTitle("3.soru");
		question.setDescription("question 3");
		question.setAskedDate("01.07.2020");
		question.setUser(user2);
		question.setViewCount(12);
		question.setVoteCount(8);*/

	/*	Question question4 = new Question();
		question.setTitle("4.soru");
		question.setDescription("question 4");
		question.setAskedDate("07.07.2020");
		question.setUser(user2);
		question.setViewCount(3);
		question.setVoteCount(4);*/

		List<Question> questions = new ArrayList<>();
		questions.add(question);
	//	questions.add(question3);

		List<Question> questions2 = new ArrayList<>();
		questions.add(question2);
	//	questions.add(question4);








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
		answer.setUser(user);
		answer2.setUser(user);
		answer3.setUser(user);

		Answer answer4 = new Answer();
		Answer answer5 = new Answer();
		Answer answer6 = new Answer();
		List<Answer> answers2 = new ArrayList<>();
		answers2.add(answer4);
		answers2.add(answer5);
		answers2.add(answer6);
		answer4.setQuestion(question2);
		answer5.setQuestion(question2);
		answer6.setQuestion(question2);
		answer4.setUser(user2);
		answer5.setUser(user2);
		answer6.setUser(user2);

		answer.setVoteCount(1);
		answer2.setVoteCount(2);
		answer3.setVoteCount(3);
		answer4.setVoteCount(4);
		answer5.setVoteCount(5);
		answer6.setVoteCount(6);

		answer.setText("First answer is this");
		answer2.setText("Second answer is this");
		answer3.setText("Third answer is this");
		answer4	.setText("Fourth answer is this");
		answer5	.setText("Fifth answer is this");
		answer6.setText("Sixth answer is this");


		question.setAnswerCount(answers.size());
		question.setAnswers(answers);

		question2.setAnswerCount(answers2.size());
		question2.setAnswers(answers2);


		Comment comment = new Comment();
		Comment comment2 = new Comment();
		Comment comment3 = new Comment();
		List<Comment> comments = new ArrayList<>();
		comments.add(comment);
		comments.add(comment2);
		comments.add(comment3);

		Comment comment4 = new Comment();
		Comment comment5 = new Comment();
		Comment comment6 = new Comment();
		List<Comment> comments2 = new ArrayList<>();
		comments2.add(comment4);
		comments2.add(comment5);
		comments2.add(comment6);

		question.setComments(comments);
		question2.setComments(comments2);

		comment.setText("comment 1 is this");
		comment2.setText("comment 2 is this");
		comment3.setText("comment 3 is  this");
		comment4.setText("comment 4 is this");
		comment5.setText("comment 5 is this");
		comment6.setText("comment 6 is this");


		comment.setQuestion(question);
	//	comment2.setQuestion(question);
		comment3.setQuestion(question);
	//	comment4.setQuestion(question2);
		comment5.setQuestion(question2);
	//	comment6.setQuestion(question2);

	//	comment.setAnswer(answer);
		comment2.setAnswer(answer2);
	//	comment3.setAnswer(answer3);
		comment4.setAnswer(answer4);
	//	comment5.setAnswer(answer5);
		comment6.setAnswer(answer6);



		comment.setDate("23.06.2020");
		comment2.setDate("24.06.2020");
		comment3.setDate("25.06.2020");
		comment4.setDate("28.06.2020");
		comment5.setDate("29.06.2020");
		comment6.setDate("30.06.2020");

		comment.setWriter(user);
		comment2.setWriter(user);
		comment3.setWriter(user);
		comment4.setWriter(user2);
		comment5.setWriter(user2);
		comment6.setWriter(user2);

		user.setAnswers(answers);
	//	user.setComments(comments);
		user.setQuestions(questions);

		user2.setAnswers(answers2);
		user2.setQuestions(questions2);

	/*	for(int i = 0; i < answers.size();i++) {
			question.getAnswers().get(i).setUser(question.getUser());
		}
		for(int i = 0; i < answers2.size();i++) {
			question2.getAnswers().get(i).setUser(question2.getUser());
		}*/


		Tag tag = new Tag();
		Tag tag2 = new Tag();

		Tag tag3 = new Tag();
		Tag tag4 = new Tag();

		List<Tag> tags = new ArrayList<>();
		List<Tag> tags2= new ArrayList<>();
		tags.add(tag);
		tags.add(tag2);

		tags2.add(tag4);
		tags2.add(tag3);

		tag.setName("tag1");
		tag2.setName("tag2");
		tag3.setName("tag3");
		tag4.setName("tag4");

		tag.setQuestions(questions);
		question.setTags(tags);
		question2.setTags(tags2);

		tag.setQuestions(questions);
		tag2.setQuestions(questions2);





		questionRepo.save(question);
		questionRepo.save(question2);
	//	questionService.save(question);
	//	questionService.save(question2);
	//	answerService.save(answer);
	//	commentService.save(comment);



	}

}
