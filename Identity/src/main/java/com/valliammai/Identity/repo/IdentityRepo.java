package com.valliammai.Identity.repo;

import com.valliammai.Identity.model.PanIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepo extends JpaRepository<PanIdentity,String> {
}
