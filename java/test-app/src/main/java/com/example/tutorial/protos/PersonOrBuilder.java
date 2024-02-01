// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

// Protobuf Java Version: 3.25.2
package com.example.tutorial.protos;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tutorial.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int32 id = 2;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <code>optional int32 id = 2;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>optional string email = 3;</code>
   * @return Whether the email field is set.
   */
  boolean hasEmail();
  /**
   * <code>optional string email = 3;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 3;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<com.example.tutorial.protos.Person.PhoneNumber> 
      getPhonesList();
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
   */
  com.example.tutorial.protos.Person.PhoneNumber getPhones(int index);
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
   */
  int getPhonesCount();
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<? extends com.example.tutorial.protos.Person.PhoneNumberOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <code>repeated .tutorial.Person.PhoneNumber phones = 4;</code>
   */
  com.example.tutorial.protos.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
      int index);
}
