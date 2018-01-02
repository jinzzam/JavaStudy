package com.youjin.exception;

public class CloseableResource implements AutoCloseable {
	public void exceptionWork(boolean exception) throws WorkException {
		System.out.println("exceptionWork(" + exception + ")가 호출됨");

		if (exception)
			throw new WorkException("WorkException발생!!!");
	}

	public void close() throws CloseException{
		System.out.println("close()가 호출됨");
		throw new CloseException("CloseException발생!!!");
	}
}
