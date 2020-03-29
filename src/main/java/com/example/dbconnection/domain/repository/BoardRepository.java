package com.example.dbconnection.domain.repository;

import com.example.dbconnection.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

// 데이터 조작을 담당
// Repository는 interface 로 정의하고, JPARepository interface 를 상속 받는다.
// JPARepository에는 일반적으로 많이 사용하는 데이터 조작을 다루는 함수가 정의되어 있기 때문에, CRUD작업이 편해진다.
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}