package com.tgt.myretail.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tgt.myretail.constant.MyRetailConstant;
import com.tgt.myretail.domain.ProductDetail;
import com.tgt.myretail.domain.ProductPricing;
import com.tgt.myretail.service.ProductService;
import com.tgt.myretail.util.Message;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
    private static final Logger log = LoggerFactory.getLogger(ProductController.class);

    /**
     * Request to get product summary along with the pricing
     * This will call external API to get product detail and call database to retrieve pricing information
     * @param productId
     * @return
     */
	@RequestMapping(value = "/{productId}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)	
	public Object findByProductDetail(@PathVariable String productId) {		
			
		try {
			Object result = productService.getProductSummary(productId);
			return result;			
		}
		catch (Exception e) {
			Message message = new Message();
			message.setError("Unexpected exception");
			return message;
		}			
	}

	/**
	 * Update product pricing. This request required HTTP request to have Content-Type as application/json
	 * @param productId
	 * @param accept
	 * @param contentType
	 * @param productDetail
	 * @return
	 */
	@RequestMapping(value = "/{productId}", method=RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)	
	public Object updateProductPrice(@PathVariable String productId, @RequestHeader(value="Accept") String accept,
										@RequestHeader(value="Content-Type") String contentType,
										@RequestBody ProductDetail productDetail) {		
			
		try {
			Object result = productService.updateProductPrice(productDetail);
			return result;	
		}
		catch (Exception e) {
			Message message = new Message();
			message.setStatus(MyRetailConstant.STATUS_ERROR);
			message.setError("Unexpected exception");
			return message;
		}			
	}

}
