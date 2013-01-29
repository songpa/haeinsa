/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package kr.co.vcnc.haeinsa.thrift.generated;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TMutationType implements org.apache.thrift.TEnum {
  PUT(1),
  REMOVE(2);

  private final int value;

  private TMutationType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TMutationType findByValue(int value) { 
    switch (value) {
      case 1:
        return PUT;
      case 2:
        return REMOVE;
      default:
        return null;
    }
  }
}
