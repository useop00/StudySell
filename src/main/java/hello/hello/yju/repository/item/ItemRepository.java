package hello.hello.yju.repository.item;

import hello.hello.yju.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends JpaRepository<ItemEntity, Long>,
    QuerydslPredicateExecutor<ItemEntity>, ItemRepositoryCustom {
        Optional<ItemEntity> findById(Long itemId);

        List<ItemEntity> findByUser_GoogleId(String googleId);

    }