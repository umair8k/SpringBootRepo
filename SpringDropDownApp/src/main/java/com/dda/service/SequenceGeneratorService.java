package com.dda.service;

public interface SequenceGeneratorService {
	public int generateSequence(String seqName);
	public int getMaxSequenceNoForSequence(String seqName);
}
