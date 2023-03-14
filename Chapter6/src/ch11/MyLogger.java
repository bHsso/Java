package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/*
 * java.util.logging.ConsoleHandler.level = INFO
 * 
 */
public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger") ;//식별자에 해당되는 것을 반환
	private static MyLogger instance = new MyLogger() ;
	
	// 생성할 File
	public static final String errorLog = "log.txt"; 
	public static final String warningLog = "warning.txt" ;
	public static final String fineLog = "fine.txt" ;
	
	
	private FileHandler logFile = null ;
	private FileHandler warningFile = null ;
	private FileHandler fineFile = null ;
	
	private MyLogger() {
		try {
			logFile = new FileHandler(errorLog , true); // fileName , true(:append로 출력(이어서 출력))
			warningFile = new FileHandler(warningLog , true);
			fineFile = new FileHandler(fineLog , true);
			
		} catch (SecurityException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logFile.setFormatter( new SimpleFormatter());
		warningFile.setFormatter( new SimpleFormatter() );
		fineFile.setFormatter( new SimpleFormatter() );

		/* log level 조정 가능 */
		logger.setLevel( Level.ALL) ;
		
		//logFile.setLevel(Level.ALL); 레벨 지정하지 않을 경우 mylogger의 레벨을 따라 감.
		fineFile.setLevel(Level.FINE); // fine레벨부터 출력
		warningFile.setLevel( Level.WARNING); // warning 레벨부터 출력
		
		logger.addHandler( logFile );
		logger.addHandler( warningFile);
		logger.addHandler( fineFile );	
	}
	
	public static MyLogger getLogger(){
		// logg
		return instance ;
	}
	
	public void log(String msg) {
		/** java.util.logging PKG에서 제공하는 로그레벨들**/
		logger.finest(msg); // 함수의 시작과 끝을 알림__err아님
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		// system이 안정되면 info 또는 warning 레벨부터 로그 기록.(첨엔 전체 기록)
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
	}
	
	public void fine(String msg) {
		logger.fine(msg);
	}
	
	public void warning(String msg) {
		logger.warning(msg); 
	}
	
	
}
