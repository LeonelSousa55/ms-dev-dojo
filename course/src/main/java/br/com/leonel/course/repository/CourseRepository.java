package br.com.leonel.course.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.leonel.course.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{    
}
