package kh.test.mybatis.common;

import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTemplate {

		public static SqlSessionFactory getSessionFactory() {
			String resource = "mybatis/mybatis-config.xml";
			SqlSessionFactory factory = null;
			try {
				//InputStream으로 Mybatis의 설정 정보를 읽어 온다.
				InputStream is = Resources.getResourceAsStream(resource);
				SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
				factory = builder.build(is);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return factory;
		}
}
