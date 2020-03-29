package com.example.dbconnection.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
// 파라미터가 없는 기본 생성자를 추가하는 어노테이션 (JPA사요응ㄹ 위해 기본 생성자 생성은 필수)
// access 는 생성자의 접근 권한을 설정하는 속성이며, 최종적으로 protected BoardEntity() 와 동일해진다.
// protected 인 이유는 Entity 생성을 외부에서 할 필요가 없기 때문이다.
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 모든 필드에 getter 를 자동생성 해주는 어노테이션이다.
@Getter
// 객체를 테이블과 매핑 할 엔티티라고 JPA에 알려주는 역할을 하는 어노테이션이다.
// @Entity 가 붙은 클래스는 JPA가 관리하며, 이를 텐티티 클래스라고 한다.
@Entity
// 엔티티 클래스와 매핑되는 테이블 정보를 명시하는 어노테이션이다.
//name 속성으로 테이블명을 작성할 수 있으며, 생략 시 엔티티 이름이 테이블명으로 자동 매핑된다.
@Table(name = "board")
public class BoardEntity extends TimeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    // @Setter 사요 ㅇ대신 Builder 패턴을 사용해야 안정성을 보장할 수 있다.
    @Builder
    public BoardEntity(Long id, String title, String content, String writer) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}