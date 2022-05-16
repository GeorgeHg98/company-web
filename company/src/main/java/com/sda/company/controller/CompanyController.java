package com.sda.company.controller;

import com.sda.company.dto.CompanyCreateDto;
import com.sda.company.dto.CompanyFullDto;
import com.sda.company.dto.CompanyResponseDto;
import com.sda.company.model.Company;
import com.sda.company.service.CompanyService;
import com.sda.company.service.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/create")
    public ResponseEntity<CompanyResponseDto> createCompany(@RequestBody CompanyCreateDto companyCreateDto) {
        CompanyResponseDto companyResponseDto = companyService.create(companyCreateDto);

        return ResponseEntity.ok(companyResponseDto);

    }

    @GetMapping("/findByName")
    public ResponseEntity<CompanyFullDto> findByName(@RequestParam String companyName) {
       CompanyFullDto companyFullDto = companyService.findCompanyByName(companyName);

       return ResponseEntity.ok(companyFullDto);
    }

}
