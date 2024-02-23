package org.modelmapper.internal.util;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author Jonathan Halterman
 */
@Test
public class PrimitivesTest {
  public void testDefaultValue() {
    assertEquals(Primitives.defaultValue(Byte.TYPE), (Byte)(byte) 0);
    assertEquals(Primitives.defaultValue(Short.TYPE), (Short)(short) 0);
    assertEquals(Primitives.defaultValue(Integer.TYPE), (Integer)0);
    assertEquals(Primitives.defaultValue(Long.TYPE), (Long)0L);
    assertEquals(Primitives.defaultValue(Float.TYPE), (Float)0.0f);
    assertEquals(Primitives.defaultValue(Double.TYPE), (Double)0.0d);
    assertEquals(Primitives.defaultValue(Character.TYPE), (Character)'\u0000');
    assertEquals(Primitives.defaultValue(Boolean.TYPE), (Boolean)false);
    
    assertNull(Primitives.defaultValue(List.class));
  }
  
  public void testIsPrimitive() {
    assertTrue(Primitives.isPrimitive(Boolean.TYPE));
    assertTrue(Primitives.isPrimitive(Boolean.class));
    assertTrue(Primitives.isPrimitive(boolean.class));
    
    assertFalse(Primitives.isPrimitive(List.class));
  }
}
