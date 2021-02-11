package com.oracle.fibonacci;

import java.util.List;

public class fibonacciData {

	List<Integer> sequence;

	int total;

	int memberCount;

	public List<Integer> getSequence() {
		return sequence;
	}

	public void setSequence(List<Integer> sequence) {
		this.sequence = sequence;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void setMemberCount(int memberCount) {
		this.memberCount = memberCount;
	}

	public fibonacciData() {

	}

	public fibonacciData(List<Integer> sequence, int total) {
		super();
		this.sequence = sequence;
		this.total = total;
	}

}
