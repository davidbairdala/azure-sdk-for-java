/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

/**
* The compute image attributes
*/
public class ComputeImageAttributes {
    private String offer;
    
    /**
    * Required. Gets or sets the publisher defined name of the offer.The
    * allowed characters are uppercase or lowercase letters, digit, hypen(-),
    * period (.).The maximum allowed length is 64 characters.
    * @return The Offer value.
    */
    public String getOffer() {
        return this.offer;
    }
    
    /**
    * Required. Gets or sets the publisher defined name of the offer.The
    * allowed characters are uppercase or lowercase letters, digit, hypen(-),
    * period (.).The maximum allowed length is 64 characters.
    * @param offerValue The Offer value.
    */
    public void setOffer(final String offerValue) {
        this.offer = offerValue;
    }
    
    private String sku;
    
    /**
    * Required. Gets or sets the publisher defined name of the Sku. The allowed
    * characters are uppercase or lowercase letters, digit, hypen(-), period
    * (.). The maximum allowed length is 64 characters.
    * @return The Sku value.
    */
    public String getSku() {
        return this.sku;
    }
    
    /**
    * Required. Gets or sets the publisher defined name of the Sku. The allowed
    * characters are uppercase or lowercase letters, digit, hypen(-), period
    * (.). The maximum allowed length is 64 characters.
    * @param skuValue The Sku value.
    */
    public void setSku(final String skuValue) {
        this.sku = skuValue;
    }
    
    private String version;
    
    /**
    * Required. Gets or sets the publisher defined version of the image. The
    * allowed characters are digit and period. Format:
    * <MajorVersion>.<MinorVersion>.<Patch>Example: '1.0.0' or '1.1.0' The 3
    * version number to follow standard of most of the RPs.See
    * http://semver.org/.
    * @return The Version value.
    */
    public String getVersion() {
        return this.version;
    }
    
    /**
    * Required. Gets or sets the publisher defined version of the image. The
    * allowed characters are digit and period. Format:
    * <MajorVersion>.<MinorVersion>.<Patch>Example: '1.0.0' or '1.1.0' The 3
    * version number to follow standard of most of the RPs.See
    * http://semver.org/.
    * @param versionValue The Version value.
    */
    public void setVersion(final String versionValue) {
        this.version = versionValue;
    }
    
    /**
    * Initializes a new instance of the ComputeImageAttributes class.
    *
    */
    public ComputeImageAttributes() {
    }
    
    /**
    * Initializes a new instance of the ComputeImageAttributes class with
    * required arguments.
    *
    * @param offer Gets or sets the publisher defined name of the offer.The
    * allowed characters are uppercase or lowercase letters, digit, hypen(-),
    * period (.).The maximum allowed length is 64 characters.
    * @param sku Gets or sets the publisher defined name of the Sku. The
    * allowed characters are uppercase or lowercase letters, digit, hypen(-),
    * period (.). The maximum allowed length is 64 characters.
    * @param version Gets or sets the publisher defined version of the image.
    * The allowed characters are digit and period. Format:
    * <MajorVersion>.<MinorVersion>.<Patch>Example: '1.0.0' or '1.1.0' The 3
    * version number to follow standard of most of the RPs.See
    * http://semver.org/.
    */
    public ComputeImageAttributes(String offer, String sku, String version) {
        if (offer == null) {
            throw new NullPointerException("offer");
        }
        if (sku == null) {
            throw new NullPointerException("sku");
        }
        if (version == null) {
            throw new NullPointerException("version");
        }
        this.setOffer(offer);
        this.setSku(sku);
        this.setVersion(version);
    }
}