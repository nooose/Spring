package org.noose.spring.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Posts, Long> { // <Entity 클래스, PK 타입>

}
