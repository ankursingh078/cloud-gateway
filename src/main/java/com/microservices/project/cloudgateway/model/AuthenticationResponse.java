package com.microservices.project.cloudgateway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationResponse {

    private String userId;
    private String accessToken;
    private String refreshToken;
    private Collection<String> authorityList;
    private long expiresAt;

}
