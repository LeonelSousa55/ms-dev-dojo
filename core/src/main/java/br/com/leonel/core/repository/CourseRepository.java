package br.com.leonel.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.leonel.core.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
