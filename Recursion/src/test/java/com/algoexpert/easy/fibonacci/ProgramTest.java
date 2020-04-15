package com.algoexpert.easy.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class ProgramTest{
  @Test
  public void TestCase1() {
    Assert.assertEquals(0,Solution1.getNthFib(1));
  }

  @Test
  public void TestCase2() {
	Assert.assertEquals(1,Solution1.getNthFib(2));
  }

  @Test
  public void TestCase3() {
    Assert.assertEquals(1,Solution1.getNthFib(3));
  }

  @Test
  public void TestCase4() {
    Assert.assertEquals(2,Solution1.getNthFib(4));
  }

  @Test
  public void TestCase5() {
    Assert.assertEquals(3,Solution1.getNthFib(5));
  }

  @Test
  public void TestCase6() {
    Assert.assertEquals(5,Solution1.getNthFib(6));
  }

  @Test
  public void TestCase7() {
    Assert.assertEquals(8,Solution1.getNthFib(7));
  }

  @Test
  public void TestCase8() {
    Assert.assertEquals(13,Solution1.getNthFib(8));
  }

  @Test
  public void TestCase9() {
    Assert.assertEquals(21,Solution1.getNthFib(9));
  }

  @Test
  public void TestCase10() {
    Assert.assertEquals(34,Solution1.getNthFib(10));
  }

  @Test
  public void TestCase11() {
    Assert.assertEquals(55,Solution1.getNthFib(11));
  }

  @Test
  public void TestCase12() {
    Assert.assertEquals(89,Solution1.getNthFib(12));
  }

  @Test
  public void TestCase13() {
    Assert.assertEquals(144,Solution1.getNthFib(13));
  }

  @Test
  public void TestCase14() {
    Assert.assertEquals(233,Solution1.getNthFib(14));
  }

  @Test
  public void TestCase15() {
    Assert.assertEquals(377,Solution1.getNthFib(15));
  }

  @Test
  public void TestCase16() {
    Assert.assertEquals(610,Solution1.getNthFib(16));
  }

  @Test
  public void TestCase17() {
    Assert.assertEquals(987,Solution1.getNthFib(17));
  }

  @Test
  public void TestCase18() {
    Assert.assertEquals(1597,Solution1.getNthFib(18));
  }
  
  public ProgramTest() {
	super();
	// TODO Auto-generated constructor stub
}

}
