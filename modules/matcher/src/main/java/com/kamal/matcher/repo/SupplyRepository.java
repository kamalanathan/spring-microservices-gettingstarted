package com.kamal.matcher.repo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.kamal.matcher.domain.Supply;

@Repository
public interface SupplyRepository extends CassandraRepository<Supply, Long> {
	//
}