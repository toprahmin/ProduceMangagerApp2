package ford.rahmir.produceManagerApp.controller;

import ford.rahmir.produceManagerApp.model.Vendor;
import ford.rahmir.produceManagerApp.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


/**
 * Created by rahmirford on 6/28/17.
 */

@RestController
public class VendorController {

    @Autowired
    private VendorRepository vendorRepository;


    @RequestMapping(value = "/vendor", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<Vendor>> getOrder(){
        ArrayList<Vendor> Vendors = (ArrayList<Vendor>) vendorRepository.findAll();
        return new ResponseEntity<>(Vendors, HttpStatus.OK);
    }

    @RequestMapping(value = "/vendor", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public ResponseEntity<?> addProductToOrder(@RequestBody Vendor vendor){
        vendor = vendorRepository.save(vendor);
        return new ResponseEntity<>(vendor,HttpStatus.CREATED);
    }

    @RequestMapping(value = "/vendor/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateVendor(@PathVariable("id") long id, @RequestBody Vendor vendor){
        Vendor currentVendor = vendorRepository.findOne(id);
        currentVendor.setPrimaryContact(vendor.getPrimaryContact());
        vendorRepository.save(currentVendor);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/vendor", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteVendor(@PathVariable("id") long id){
        vendorRepository.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
