package com.controllerExamps;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ProductDtExamps.ProductDto;
import com.serviceExamp.ProductService;

@Controller
public class ProductControllers {

	private ProductService productService;

	@RequestMapping(value = "product", method = RequestMethod.GET)
	public ModelAndView showPage() {
		System.out.println("product in api is working");

		ProductDto p = productService.giveDemoProduct();
		System.out.println(p.toString());
		ModelAndView mv = new ModelAndView("product-page");
		mv.addObject("pt", p);
		mv.addObject("username", "Samir");
		return mv;
	}

	@RequestMapping(value = "product-form", method = RequestMethod.GET)
	public ModelAndView showProductPage() {
		ProductDto p = new ProductDto();

		ModelAndView mv = new ModelAndView("product-form");
		mv.addObject("productObj", p);
		return mv;
	}

	@RequestMapping(value = "save-product", method = RequestMethod.POST)
	public ModelAndView saveProduct(ProductDto product) {
		System.out.println("i am receiving product from user");
		System.out.println(product.toString());

		ModelAndView mv = new ModelAndView("product-page");
		mv.addObject("pt", product);
		return mv;

	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
