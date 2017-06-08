package com.example.domain;

import com.example.exception.OverSpeedException;

/**
 * �Ԃ�\���N���X.
 * @author igamasayuki
 *
 */
public class Car {
	/** �������x */
	private final int MAX_SPEED = 120;
	/** �ُ�ȑ��x */
	private final int ABNORMAL_SPEED = 100;
	/** ���x */
	private int speed;
	/** �v���[�g�i���o�[ */
	private String plateNumber;
	/** �ԑ̂̐F */
	private String bodyColor;

	/**
	 * <pre>
	 * �Ԃ̑��x���グ�܂�.
	 * ���̎Ԃ͂����葬�x�ȏ�o�����Ƃ��ł��Ȃ��悤�ɐ��䂳��Ă��܂��B
	 * �܂��}���ɑ��x���グ�悤�Ƃ���Ɨ�O���������܂��B
	 * </pre>
	 * @param speed �グ�������x
	 * @return�@�オ������̑��x
	 * @throws OverSpeedException ���x���}���ɏグ�悤�Ƃ����ꍇ�ɔ��������O
	 */
	public int speedUp(int speed) throws OverSpeedException{
		if (speed >= ABNORMAL_SPEED) {
			throw new OverSpeedException("�}���ȃX�s�[�h�A�b�v�͂ł��܂���B");
		}
		if (speed < 0) {
			throw new IllegalArgumentException("�X�s�[�h���}�C�i�X���邱�Ƃ͂ł��܂���B");
		}
		
		this.speed += speed;
		
		if(this.speed >= MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
		return this.speed;
	}

	
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	
}
