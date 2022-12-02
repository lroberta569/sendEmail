package com.larissa.arphoenix.emailSpringCloundAzure.repositories;

import com.larissa.arphoenix.emailSpringCloundAzure.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
