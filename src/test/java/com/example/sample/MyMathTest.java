package com.example.sample;


//Matcher�֘A���\�b�h�𗘗p���邽�߂�static�C���|�[�g
import static org.hamcrest.CoreMatchers.*;
//JUnit�֘A���\�b�h�𗘗p���邽�߂�static�C���|�[�g
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
* MyMath�N���X�̃e�X�g.
* 
* @author igamasayuki
*
*/
public class MyMathTest {

  /** �v�Z���� */
  private double answer;

  /**
   * <pre>
   * �S�e�X�g���s�O�ɂP�x�������s�����Z�b�g�A�b�v���\�b�h.
   * �S�Ẵe�X�g�ɋ��ʂ���O�������s���ۂɎg�p����B
   * �Ⴆ�΁A�S�e�X�g�ŗ��p����e�X�g�f�[�^����邽�߂�SQL
   * �����s����ȂǁB
   * </pre>
   * 
   * @throws Exception
   *             �@����͗�O�͔������Ȃ�
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
      System.out.println("setUpBeforeClass()�̌ďo���B�S�e�X�g���s�O�ɂP�x�������s�����");
  }

  /**
   * <pre>
   * �S�e�X�g���s��ɂP�x�������s����郁�\�b�h.
   * �Ⴆ�΁A�g�p�����e�X�g�f�[�^���폜���A���������鏈���ȂǁB
   * </pre>
   * 
   * @throws Exception
   *             �@����͗�O�͔������Ȃ�
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
      System.out.println("tearDownAfterClass()�̌ďo���B�S�e�X�g���s��ɂP�x�������s�����");
  }

  /**
   * <pre>
   * �e�e�X�g���s�O�ɖ�����s����郁�\�b�h.
   * �e�e�X�g�ŋ��ʂ����O����������΂�����ɏ����������B
   * ������񂪋l�܂����C���X�^���X���쐬���鏈���ȂǁB
   * </pre>
   * 
   * @throws Exception
   *             �@����͗�O�͔������Ȃ�
   */
  @Before
  public void setUp() throws Exception {
      // ����v�Z���ʂ�����answer��������
      answer = 0.0;
      System.out.println("setUp()�̌ďo���B�e�e�X�g���s�O�ɖ�����s�����");
  }

  /**
   * <pre>
   * �e�e�X�g���s��ɖ�����s����郁�\�b�h.
   * �e�e�X�g�ŋ��ʂ����㏈��������΂�����ɏ����������B
   * �e�X�g�Ŏg�p�����C���X�^���X(�I�u�W�F�N�g)�͎����I�Ƀ���������
   * �폜����邽�߁A���̃��\�b�h�͂��܂藘�p�̋@��͂Ȃ��B
   * </pre>
   * 
   * @throws Exception
   *             �@����͗�O�͔������Ȃ�
   */
  @After
  public void tearDown() throws Exception {
      System.out.println("tearDown()�̌ďo���B�e�e�X�g���s��ɖ�����s�����");
  }

  // ��̑O(Junit4.3�ȑO)�̌��؃��\�b�h
  // assertEquals("�G���[���b�Z�[�W", "���Ғl", "���ۂ̌���");
  // assertNotEquals("�G���[���b�Z�[�W", "���Ғl", "���ۂ̌���");
  // �ŋ�(Junit4.4����)�̌��؃��\�b�h
  // assertThat("�G���[���b�Z�[�W", "���ۂ̌���", is("���Ғl"));
  // assertThat("�G���[���b�Z�[�W", "���ۂ̌���", equalTo("���Ғl")); is�Ɠ����Bis�̕��������I
  // assertThat("�G���[���b�Z�[�W", "���ۂ̌���", is(not("���Ғl")));

  @Test
  public void testPower1() {
      answer = MyMath.power(0, -2);
      assertThat("TC1:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testPower2() {
      answer = MyMath.power(0, -1);
      assertThat("TC2:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(Double.POSITIVE_INFINITY));
  }

  @Test
  public void testPower3() {
      answer = MyMath.power(0, 0);
      assertThat("TC3:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower4() {
      answer = MyMath.power(0, 1);
      assertThat("TC4:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.0));
  }

  @Test
  public void testPower5() {
      answer = MyMath.power(0, 2);
      assertThat("TC5:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.0));
  }

  @Test
  public void testPower6() {
      answer = MyMath.power(1, -2);
      assertThat("TC6:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower7() {
      answer = MyMath.power(1, -1);
      assertThat("TC7:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower8() {
      answer = MyMath.power(1, 0);
      assertThat("TC8:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower9() {
      answer = MyMath.power(1, 1);
      assertThat("TC9:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower10() {
      answer = MyMath.power(1, 2);
      assertThat("TC10:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower11() {
      answer = MyMath.power(-1, -2);
      assertThat("TC11:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower12() {
      answer = MyMath.power(-1, -1);
      assertThat("TC12:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(-1.0));
  }

  @Test
  public void testPower13() {
      answer = MyMath.power(-1, 0);
      assertThat("TC13:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower14() {
      answer = MyMath.power(-1, 1);
      assertThat("TC14:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(-1.0));
  }

  @Test
  public void testPower15() {
      answer = MyMath.power(-1, 2);
      assertThat("TC15:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower16() {
      answer = MyMath.power(2, -2);
      assertThat("TC16:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.25));
  }

  @Test
  public void testPower17() {
      answer = MyMath.power(2, -1);
      assertThat("TC17:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(0.5));
  }

  @Test
  public void testPower18() {
      answer = MyMath.power(2, 0);
      assertThat("TC18:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(1.0));
  }

  @Test
  public void testPower19() {
      answer = MyMath.power(2, 1);
      assertThat("TC19:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(2.0));
  }

  @Test
  public void testPower20() {
      answer = MyMath.power(2, 2);
      assertThat("TC20:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�", answer, is(4.0));
  }

  /**
   * ��O���������邩����
   */
  @Test
  public void testPower21() {
      try {
          answer = MyMath.power(100, 0);
          fail("TC21:��O���������Ȃ���΂Ȃ�܂���");
      } catch (IllegalArgumentException e) {
          assertThat("���b�Z�[�W����v���܂���", e.getMessage(), is("100�ȏ�̒l�͕s���ł�"));
      }
  }

  /**
   * ��O���������邩����
   */
  @Test
  public void testPower22() {
      try {
          answer = MyMath.power(0, 1000);
          fail("TC22:��O���������Ȃ���΂Ȃ�܂���");
      } catch (IllegalArgumentException e) {
          assertThat("���b�Z�[�W����v���܂���", e.getMessage(), is("100�ȏ�̒l�͕s���ł�"));
      }
  }

}
