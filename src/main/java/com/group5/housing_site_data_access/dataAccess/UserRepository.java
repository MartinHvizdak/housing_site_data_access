package com.group5.housing_site_data_access.dataAccess;

import com.group5.housing_site_data_access.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
