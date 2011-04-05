package com;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
  @Test
  public void testTrue() {
    assertTrue(true);
  }
  @Test
  public void testFalse() {
    assertFalse(false);
  }
  @Test
  public void testFailure() {
    assertTrue(false);
  }
}