package com.taxii.driver.identifier;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType(value = "identifier")
public class Identifier {

  private String idKey;

  private String idType;

  private String value;

  protected Identifier() {}

  public Identifier(String idKey, String idType, String value) {
    this.idKey = idKey;
    this.idType = idType;
    this.value = value;
  }

  //Getters & Setters
}