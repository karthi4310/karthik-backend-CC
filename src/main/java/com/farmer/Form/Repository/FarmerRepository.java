package com.farmer.Form.Repository;


import com.farmer.Form.Entity.Farmer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
 
public interface FarmerRepository extends JpaRepository<Farmer, Long> {
    List<Farmer> findByAssignedEmployee_Email(String email);
}