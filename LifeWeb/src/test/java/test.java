import newswebsite.controller.news_Controller;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
   public static  void main (String[] args) throws Exception {
       /*  ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/dispatcher-servlet.xml");
     news_Controller a = ac.getBean("news_Controller",news_Controller.class);
        System.out.println(a);*/


    /*  List<String> warnings = new ArrayList<String>();
       boolean overwrite = true;
       File configFile = new File("mbg.xml");
       ConfigurationParser cp = new ConfigurationParser(warnings);
       Configuration config = cp.parseConfiguration(configFile);
       DefaultShellCallback callback = new DefaultShellCallback(overwrite);
       MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
       myBatisGenerator.generate(null);*/
   }
}
