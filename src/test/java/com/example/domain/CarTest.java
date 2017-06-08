package com.example.domain;

//org.hamcrest.CoreMatchers�N���X��Matcher�֘A���\�b�h�𗘗p���邽�߂�static�C���|�[�g
import static org.hamcrest.CoreMatchers.*;
//JUnit�֘A���\�b�h�𗘗p���邽�߂�static�C���|�[�g
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.example.exception.OverSpeedException;

/**
 * Car�N���X���e�X�g����N���X.
 * @author igamasayuki
 *
 */
public class CarTest {

	Car car;
	
	/**
	 * <pre>
	 * �S�e�X�g���s�O�ɂP�x�������s�����Z�b�g�A�b�v���\�b�h.
	 * �S�Ẵe�X�g�ɋ��ʂ���O�������s���ۂɎg�p����B
	 * �Ⴆ�΁A�S�e�X�g�ŗ��p����e�X�g�f�[�^����邽�߂�SQL
	 * �����s����ȂǁB
	 * </pre>
	 * @throws Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("�S�e�X�g���s�O�ɂP�x�������s�����");
	}

	/**
	 * <pre>
	 * �S�e�X�g���s��ɂP�x�������s����郁�\�b�h.
	 * �Ⴆ�΁A�g�p�����e�X�g�f�[�^���폜���A���������鏈���ȂǁB
	 * </pre>
	 * @throws Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("�S�e�X�g���s��ɂP�x�������s�����");
	}

	/**
	 * <pre>
	 * �e�e�X�g���s�O�ɖ�����s����郁�\�b�h.
	 * �e�e�X�g�ŋ��ʂ����O����������΂�����ɏ����������B
	 * ������񂪋l�܂����C���X�^���X���쐬���鏈���ȂǁB
	 * </pre>
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("�e�e�X�g���s�O�ɖ�����s�����");
		car = new Car();
		car.setPlateNumber("000-0000");
		car.setBodyColor("Gold");
	}

	/**
	 * <pre>
	 * �e�e�X�g���s��ɖ�����s����郁�\�b�h.
	 * �e�e�X�g�ŋ��ʂ����㏈��������΂�����ɏ����������B
	 * �e�X�g�Ŏg�p�����C���X�^���X(�I�u�W�F�N�g)�͎����I�Ƀ���������
	 * �폜����邽�߁A���̃��\�b�h�͂��܂藘�p�̋@��͂Ȃ��B
	 * </pre>
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("�e�e�X�g���s��ɖ�����s�����");
	}

	/**
	 * <pre>
	 * Car�N���X��speedUp()���\�b�h�̐���n�e�X�g.
	 * �Ԃ̃X�s�[�h���w�肵�����x���オ���Ă��邩�e�X�g����B
	 * </pre>
	 */
	@Test
	public void testSpeedUp0() throws OverSpeedException{
		System.out.println("testSpeedUp()���\�b�h���s");
		int actual = car.speedUp(10);
		int expected = 10; //�����������������Ď��s�����Ă݂�
		// ��̑O�̌��ؕ��@
		assertEquals("�X�s�[�h�̒l������������܂���B", expected, actual);
		// �ŋ߂̌��ؕ��@
		assertThat("�X�s�[�h�̒l������������܂���B", actual, is(expected));
		assertThat("�X�s�[�h�̒l������������܂���B", actual, equalTo(expected));
		assertThat("�X�s�[�h�̒l������������܂���B", actual, is(not(expected+1)));
	}

	/**
	 * <pre>
	 * Car�N���X��speedUp()���\�b�h�̃e�X�g.
	 * �Ԃ̃X�s�[�h������120km/h�ȏ�o�Ȃ����Ƃ��e�X�g����B
	 * </pre>
	 */
	@Test
	public void testSpeedUp1() throws OverSpeedException{
		System.out.println("testSpeedUp1()���\�b�h���s");
		assertThat("�X�s�[�h�̒l������������܂���B", 10, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 20, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 30, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 40, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 50, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 60, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 70, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 80, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 90, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 100, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 110, is(car.speedUp(10)));
		assertThat("�X�s�[�h�̒l������������܂���B", 120, is(car.speedUp(10)));
		// ����120km/h�ȏ�o�Ȃ����Ƃ��m�F
		assertThat("�X�s�[�h�̒l������������܂���B", 120, is(car.speedUp(10)));
	}
	
	/**
	 * <pre>
	 * Car�N���X��speedUp()���\�b�h�̃e�X�g.
	 * �}���ȃX�s�[�h�A�b�v���s�����ۂɗ�O���o�邩�e�X�g����B
	 * ���E�l�F99,100��99���e�X�g
	 * </pre>
	 */
	@Test
	public void testSpeedUp2() {
		System.out.println("testSpeedUp2()���\�b�h���s");
		try {
			assertThat("�X�s�[�h�̒l������������܂���B", 99, is(car.speedUp(99)));
		} catch (OverSpeedException e) {
			fail("OverSpeedException���������܂����B");
		}
	}
	
	/**
	 * <pre>
	 * Car�N���X��speedUp()���\�b�h�̃e�X�g.
	 * �}���ȃX�s�[�h�A�b�v���s�����ۂɗ�O���o�邩�e�X�g����B
	 * ���E�l�F99,100��100���e�X�g
	 * </pre>
	 */
	@Test
	public void testSpeedUp3() {
		System.out.println("testSpeedUp3()���\�b�h���s");
		try {
			car.speedUp(100);
			fail("��O���������܂���ł����B");
		} catch (OverSpeedException e) {
		    assertThat("���b�Z�[�W����v���܂���",
                    e.getMessage(),
                    is("�}���ȃX�s�[�h�A�b�v�͂ł��܂���B"));
		}
	}

	/**
	 * <pre>
	 * Car�N���X��speedUp()���\�b�h�̃e�X�g.
	 * �X�s�[�h�A�b�v���}�C�i�X�ɂ��悤�Ƃ����ۂɗ�O���o�邩�e�X�g����B
	 * </pre>
	 */
	@Test(expected = IllegalArgumentException.class)
	public void testSpeedUp4() {
		System.out.println("testSpeedUp4()���\�b�h���s");
		try {
			car.speedUp(-1);
		} catch (OverSpeedException e) {
			fail("�Ⴄ��O���X���[���܂����B");
		}
	}
}
