package org.example.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalheProdutoRepository extends JpaRepository<DetalheProduto, Long> {
}
