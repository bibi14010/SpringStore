package com.istic.fr.services;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@NoArgsConstructor
public class CreatorInfoService {

    @Getter
    @Setter
    @NonNull
    @Value("${user.firstname}")
    private String firstName;

    @Getter
    @Setter
    @NonNull
    @Value("${user.lastname}")
    private String lastName;

    @Getter
    @Setter
    @NonNull
    @Value("${user.school}")
    private String school;

    public String getMessage(){
        return("This project has been made by "+firstName+" "+lastName+" for "+school+" !");
    }
}
