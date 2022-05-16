package com.sda.company.service;

import com.sda.company.dto.CompanyCreateDto;
import com.sda.company.dto.CompanyFullDto;
import com.sda.company.dto.CompanyResponseDto;

public interface CompanyService {

    CompanyResponseDto create(CompanyCreateDto companyCreateDto);

    CompanyFullDto findCompanyByName(String name);
}
