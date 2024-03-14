package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	// 응답 결과가 여러건인 경우에는 리턴타입을 question이 아닌 List<Question>으로 사용.
	List<Question> findBySubjectLike(String subject);
}
