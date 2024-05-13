package hello.hello.yju.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user")
public class UserEntity extends BaseEntity{

    @Id
    @Column(name = "user_id")
    private String googleId;

    private String email;

    private String role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ItemEntity> items = new ArrayList<>();

}
