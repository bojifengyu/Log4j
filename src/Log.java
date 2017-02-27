import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Logger log = null;
        
        try{
        	// 初始化日志生成器，加载日志配置文件  
        	PropertyConfigurator.configure("./log4j.properties");
        	log = Logger.getLogger(Log.class.getName()); 
        	log.debug("main");
        	log.debug("中国");
        	log.debug("实验室");
            log.debug("Hello this is an debug message");
            log.info("Hello this is an info message");
            log.error("Hello this is an error message");
            log.fatal("Hello this is an fatal message");
            log.warn("Hello this is an warn message");
        	int i = 1/0;
        } catch(Exception e){
        	// 记录日志
        	log.info(e.getMessage());
        	//e.printStackTrace();
        }

	}

}
