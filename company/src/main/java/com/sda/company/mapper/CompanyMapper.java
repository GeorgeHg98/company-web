package com.sda.company.mapper;

import com.sda.company.dto.CompanyCreateDto;
import com.sda.company.dto.CompanyFullDto;
import com.sda.company.dto.CompanyResponseDto;
import com.sda.company.model.Company;

public class CompanyMapper {

    public static Company toEntity(CompanyCreateDto companyCreateDto) {
        Company company = new Company();
        company.setName(companyCreateDto.getName());
        company.setAddress(companyCreateDto.getAddress());
        company.setPhoneNumber(companyCreateDto.getPhoneNumber());
        company.setEmail(companyCreateDto.getEmail());
        company.setRegistrationNumber(companyCreateDto.getRegistrationNumber());

        return company;
    }

    public static CompanyResponseDto toResponseDto(Company company) {
        CompanyResponseDto companyResponseDto = new CompanyResponseDto();
        companyResponseDto.setId(company.getId());
        companyResponseDto.setName(company.getName());
        companyResponseDto.setPhoneNumber(company.getPhoneNumber());
        companyResponseDto.setRegistrationNumber(company.getRegistrationNumber());

        return companyResponseDto;
    }

    public static CompanyFullDto toFullDto(Company company) {
        CompanyFullDto companyFullDto = new CompanyFullDto();
        companyFullDto.setId(company.getId());
        companyFullDto.setName(company.getName());
        companyFullDto.setPhoneNumber(company.getPhoneNumber());
        companyFullDto.setRegistrationNumber(company.getRegistrationNumber());
        companyFullDto.setAddress(company.getAddress());
        companyFullDto.setEmail(company.getEmail());

        return companyFullDto;
    }
}
