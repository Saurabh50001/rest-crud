package com.practice.restcrud.controller;

import com.practice.restcrud.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

// Theis class is used to provide API services for crud operation.
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    // first method is creating for getting the value so get request.
    CloudVendor cloudVendor;  // build a object of cloudvendor
    @GetMapping("{vendorId}") // to know the spring this is specific for get api.
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return cloudVendor; // here is return the cloudvendor object
         // new CloudVendor("C1","vendor 1","Address One","xxxx");
    }
    // reson to build an object to create a details and fill these details in cloudvendor
    @PostMapping  // for insert data
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping  // for update data
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated Successfully";
    }
    @DeleteMapping("{vendorId}")  // for delete data
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor deleted Successfully";
    }
}
