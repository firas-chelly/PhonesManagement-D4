package com.firas.telephones.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "marqueTel", types = { Telephone.class })


public interface TelephoneProjection {
public String getMarqueTel();
}


