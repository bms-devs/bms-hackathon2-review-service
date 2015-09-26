package org.bmshackathon;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReviewController {

    ReviewRepository clientRepository;

    @Autowired
    public ReviewController(ReviewRepository reviewRepository) {
        this.clientRepository = reviewRepository;
    }
}
