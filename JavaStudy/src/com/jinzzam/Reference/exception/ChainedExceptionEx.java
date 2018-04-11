package com.youjin.exception;

public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();  //1
		} catch(InstallException e){	//10
			e.printStackTrace();	//11
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	static void install() throws InstallException {
		try {
			startInstall();	//2
			copyFiles();
		} catch(SpaceException e) {	//6
			InstallException ie = new InstallException("설치 중 예외발생");	//7
			ie.initCause(e);		//원인 예외 설정함	//8
			throw ie;		//9
		} catch(MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();	//프로그램 설치에 사용된 임시 파일들을 삭제
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException{
		if(!enoughSpace()) {		//충분한 설치공간이 없으면		//3
			throw new SpaceException("설치할 공간이 부족합니다.");	//5
		}
		
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	}
	
	static void copyFiles() {/*파일 복사*/}
	static void deleteTempFiles() {/*임시 파일들 삭제*/}
	
	static boolean enoughSpace() {	//4
		//설치하는데 필요한 공간이 있는지 확인
		return false;
	}
	
	static boolean enoughMemory() {
		//설치하는데 필요한 메모리가 있는지 확인
		return true;
	}
}
