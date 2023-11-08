package io.github.ismaelE77.tacocloud.Interfaces;

import io.github.ismaelE77.tacocloud.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder,Long> {
}