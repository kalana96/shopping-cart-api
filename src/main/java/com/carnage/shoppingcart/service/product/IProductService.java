package com.carnage.shoppingcart.service.product;

//import com.carnage.shoppingcart.dto.ProductDto;
import com.carnage.shoppingcart.model.Product;
import com.carnage.shoppingcart.request.AddProductRequest;
import com.carnage.shoppingcart.request.ProductUpdateRequest;


import java.util.List;

public interface IProductService {
    Product addProduct(AddProductRequest product);
    Product getProductById(Long id);
//    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String category, String name);
    Long countProductsByBrandAndName(String brand, String name);

//    List<ProductDto> getConvertedProducts(List<Product> products);
//
//    ProductDto convertToDto(Product product);

   // List<Product> getDistinctProductsByCategory();

    List<Product> findDistinctProductsByName();

    List<String> getAllDistinctBrands();
}
