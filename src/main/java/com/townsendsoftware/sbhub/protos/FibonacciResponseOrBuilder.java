// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sbhub.proto

package com.townsendsoftware.sbhub.protos;

public interface FibonacciResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.townsendsoftware.sbhub.protos.FibonacciResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 version = 1;</code>
   */
  int getVersion();

  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
   */
  boolean hasSequence();
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
   */
  com.townsendsoftware.sbhub.protos.FibonacciSequence getSequence();
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciSequence sequence = 2;</code>
   */
  com.townsendsoftware.sbhub.protos.FibonacciSequenceOrBuilder getSequenceOrBuilder();

  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
   */
  boolean hasParameters();
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
   */
  com.townsendsoftware.sbhub.protos.FibonacciParameters getParameters();
  /**
   * <code>.com.townsendsoftware.sbhub.protos.FibonacciParameters parameters = 3;</code>
   */
  com.townsendsoftware.sbhub.protos.FibonacciParametersOrBuilder getParametersOrBuilder();

  /**
   * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
   */
  boolean hasMessage();
  /**
   * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
   */
  com.townsendsoftware.sbhub.protos.ResponseMessage getMessage();
  /**
   * <code>.com.townsendsoftware.sbhub.protos.ResponseMessage message = 4;</code>
   */
  com.townsendsoftware.sbhub.protos.ResponseMessageOrBuilder getMessageOrBuilder();
}
