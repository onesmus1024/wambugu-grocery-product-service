/**
 * 
 */
package com.example.wambugugrocery.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.wambugugrocery.model.Product;

/**
 * @author onesmus
 *
 */

public interface ProductRepo extends JpaRepository<Product, Long> {
	

}
