package org.bmshackathon;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Review {

    @Id
    Long id;

    @Column(length = 512, nullable = false)
    @NotBlank
    String text;

    @Column(length = 256, nullable = false)
    @NotBlank
    String clientFullName;

    @Column(nullable = false)
    @DecimalMin("0")
    @DecimalMax("10")
    Integer rating;

    @Column(nullable = false)
    @NotNull
    Long videoImageId;

}
