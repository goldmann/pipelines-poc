package com.redhat.cpaas.controller;

import com.redhat.cpaas.model.BuildQuality;
import com.redhat.cpaas.model.Product;

public interface ProductController {
    /**
     * Returns build quality for latest build of a particular product.
     * 
     * @param product
     * @return
     */
    BuildQuality getBuildQuality(Product product);
}
