// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/com/hry/spring/grpc/stream/route_guide.proto

package com.hry.spring.grpc.stream;

public interface RectangleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Rectangle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 引入Message Point
   * </pre>
   *
   * <code>optional .Point lo = 1;</code>
   */
  boolean hasLo();
  /**
   * <pre>
   * 引入Message Point
   * </pre>
   *
   * <code>optional .Point lo = 1;</code>
   */
  Point getLo();
  /**
   * <pre>
   * 引入Message Point
   * </pre>
   *
   * <code>optional .Point lo = 1;</code>
   */
  PointOrBuilder getLoOrBuilder();

  /**
   * <code>optional .Point hi = 2;</code>
   */
  boolean hasHi();
  /**
   * <code>optional .Point hi = 2;</code>
   */
  Point getHi();
  /**
   * <code>optional .Point hi = 2;</code>
   */
  PointOrBuilder getHiOrBuilder();
}
