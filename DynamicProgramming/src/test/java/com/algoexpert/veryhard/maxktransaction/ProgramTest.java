package com.algoexpert.veryhard.maxktransaction;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ProgramTest {
	@Test
	  public void TestCase1() {
	    int[] input = {};
	    
	    assertThat(Program2.maxProfitWithKTransactions(input, 1)).isEqualTo(0);
	  }

	  @Test
	  public void TestCase2() {
	    int[] input = {1};
	    assertThat(Program2.maxProfitWithKTransactions(input, 1)).isEqualTo(0);
	  }

	  @Test
	  public void TestCase3() {
	    int[] input = {1, 10};
	    assertThat(Program2.maxProfitWithKTransactions(input, 1)).isEqualTo(9);
	  }

	  @Test
	  public void TestCase4() {
	    int[] input = {1, 10};
	    assertThat(Program2.maxProfitWithKTransactions(input, 3)).isEqualTo(9);
	  }

	  @Test
	  public void TestCase5() {
	    int[] input = {3, 2, 5, 7, 1, 3, 7};
	    assertThat(Program2.maxProfitWithKTransactions(input, 1)).isEqualTo(6);
	  }

	  @Test
	  public void TestCase6() {
	    int[] input = {5, 11, 3, 50, 60, 90};
	    assertThat(Program2.maxProfitWithKTransactions(input, 2)).isEqualTo(93);
	  }

	  @Test
	  public void TestCase7() {
	    int[] input = {5, 11, 3, 50, 60, 90};
	    assertThat(Program2.maxProfitWithKTransactions(input, 3)).isEqualTo(93);
	  }

	  @Test
	  public void TestCase8() {
	    int[] input = {5, 11, 3, 50, 40, 90};
	    assertThat(Program2.maxProfitWithKTransactions(input, 2)).isEqualTo(97);
	  }

	  @Test
	  public void TestCase9() {
	    int[] input = {5, 11, 3, 50, 40, 90};
	    assertThat(Program2.maxProfitWithKTransactions(input, 3)).isEqualTo(103);
	  }

	  @Test
	  public void TestCase10() {
	    int[] input = {50, 25, 12, 4, 3, 10, 1, 100};
	    assertThat(Program2.maxProfitWithKTransactions(input, 2)).isEqualTo(106);
	  }

	  @Test
	  public void TestCase11() {
	    int[] input = {100, 99, 98, 97, 1};
	    assertThat(Program2.maxProfitWithKTransactions(input, 5)).isEqualTo(0);
	  }

	  @Test
	  public void TestCase12() {
	    int[] input = {1, 100, 2, 200, 3, 300, 4, 400, 5, 500};
	    assertThat(Program2.maxProfitWithKTransactions(input, 5)).isEqualTo(1485);
	  }

	  @Test
	  public void TestCase13() {
	    int[] input = {1, 100, 101, 200, 201, 300, 301, 400, 401, 500};
	    assertThat(Program2.maxProfitWithKTransactions(input, 5)).isEqualTo(499);
	  }

	  @Test
	  public void TestCase14() {
	    int[] input = {1, 25, 24, 23, 12, 36, 14, 40, 31, 41, 5};
	    assertThat(Program2.maxProfitWithKTransactions(input, 4)).isEqualTo(84);
	  }

	  @Test
	  public void TestCase15() {
	    int[] input = {1, 25, 24, 23, 12, 36, 14, 40, 31, 41, 5};
	    assertThat(Program2.maxProfitWithKTransactions(input, 2)).isEqualTo(62);
	  }
}
