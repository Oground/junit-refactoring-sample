package com.example.sample;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.example.refactoring.ExerciseMathBefore;

public class ExerciseMathTest {

	@Test
	public void testFactorial() {
		int answer = 0;
		try {
			answer = ExerciseMathBefore.factorial(-1);
			fail("TC1:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC1:���b�Z�[�W����v���܂���",
					e.getMessage(),
					is("0�ȉ��̒l�͕s���ł��B"));
		}
		
		try {
			answer = ExerciseMathBefore.factorial(0);
			fail("TC2:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC2:���b�Z�[�W����v���܂���",
					e.getMessage(),
					is("0�ȉ��̒l�͕s���ł��B"));
		}
		
		answer = ExerciseMathBefore.factorial(1);
		System.out.println(answer);
		assertThat("TC3:�l����v���܂���", answer, is(1));
		
		answer = ExerciseMathBefore.factorial(2);
		assertThat("TC4:�l����v���܂���", answer, is(2));
		
		answer = ExerciseMathBefore.factorial(3);
		assertThat("TC5:�l����v���܂���", answer, is(6));
		
		answer = ExerciseMathBefore.factorial(4);
		assertThat("TC6:�l����v���܂���", answer, is(24));
		
		answer = ExerciseMathBefore.factorial(11);
		assertThat("TC7:�l����v���܂���", answer, is(39916800));
		
		answer = ExerciseMathBefore.factorial(12);
		assertThat("TC8:�l����v���܂���", answer, is(479001600));
		
		try {
			answer = ExerciseMathBefore.factorial(13);
			fail("TC9:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC9:���b�Z�[�W����v���܂���",
					e.getMessage(),
					is("13�ȏ�̒l�͕s���ł��B"));
		}
		
		try {
			answer = ExerciseMathBefore.factorial(14);
			fail("TC10:��O���������Ȃ���΂Ȃ�܂���");
		} catch (IllegalArgumentException e) {
			assertThat("TC10:���b�Z�[�W����v���܂���",
					e.getMessage(),
					is("13�ȏ�̒l�͕s���ł��B"));
		}
	}

}
