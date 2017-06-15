package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Test.class);
		List<Map> list = new ArrayList<Map>();
		for(int i = 0; i < 100; i++) {
			Map map = new HashMap();
			map.put(i, "haha" + i);
			list.add(map);
		}
		logger.debug(JSON.toJSONString(list));
	}
}
