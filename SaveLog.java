package dao;
import util.fileLogger;

public class SaveLog{
    public static void save(String log){
        fileLogger.write(log);
    }
}