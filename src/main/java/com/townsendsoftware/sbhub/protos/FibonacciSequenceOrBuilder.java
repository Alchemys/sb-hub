// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sbhub.proto

package com.townsendsoftware.sbhub.protos;

public interface FibonacciSequenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.townsendsoftware.sbhub.protos.FibonacciSequence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 version = 1;</code>
   */
  int getVersion();

  /**
   * <code>int32 count = 2;</code>
   */
  int getCount();

  /**
   * <code>repeated int64 sequence = 4;</code>
   */
  java.util.List<java.lang.Long> getSequenceList();
  /**
   * <code>repeated int64 sequence = 4;</code>
   */
  int getSequenceCount();
  /**
   * <code>repeated int64 sequence = 4;</code>
   */
  long getSequence(int index);
}