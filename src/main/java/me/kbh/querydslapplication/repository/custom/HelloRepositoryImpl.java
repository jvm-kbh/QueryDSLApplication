package me.kbh.querydslapplication.repository.custom;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HelloRepositoryImpl implements CustomHelloRepository{

    JPAQueryFactory jpaQueryFactory;

}
