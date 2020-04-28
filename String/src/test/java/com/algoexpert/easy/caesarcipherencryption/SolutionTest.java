package com.algoexpert.easy.caesarcipherencryption;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;



public class SolutionTest {

	@Test
	public void TestCase1() {
		assertThat(Solution2.caesarCypherEncryptor("xyz", 2)).isEqualTo("zab");
	}
	
	@Test
	public void TestCase2() {
		assertThat(Solution2.caesarCypherEncryptor("abc", 0)).isEqualTo("abc");
	}
	
	@Test
	public void TestCase3() {
		assertThat(Solution2.caesarCypherEncryptor("abc", 3)).isEqualTo("def");
	}
	
	@Test
	public void TestCase4() {
		assertThat(Solution2.caesarCypherEncryptor("abc", 52)).isEqualTo("abc");
	}
}
