package com.essential.swagger.test.model;/*
package com.essential.web.model;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

*/

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by esse-Zhurong on 2015/9/6.
 */

public class APIModelFactory {

    private Logger log = Logger.getLogger(APIModelFactory.class);

    private static APIModelFactory responseFactory = new APIModelFactory();

    private Map<String, String> apiHolder = new HashMap<String, String>() {
        {
            put("/api/moment/v1/list", "com.essential.swagger.test.model.APIModel1001");
            put("/api/venue/v1/list", "com.essential.swagger.test.model.APIModel1002");
        }
    };

    private APIModelFactory() {}

    public static APIModelFactory getInstance() {
        return responseFactory;

    }

    public <T> T  buildModel(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            log.error(e);
        } catch (IllegalAccessException e) {
            log.error(e);
        }
        return null;
    }

    public Object buildModel(String api) {
        String className = apiHolder.get(api);
        try {
            return Class.forName(className).newInstance();
        } catch (ClassNotFoundException e) {
            log.error(e);
        } catch (InstantiationException e) {
            log.error(e);
        } catch (IllegalAccessException e) {
            log.error(e);
        }
        return null;
    }

//    public static void main(String args[]) {
//
//        APIModel1001 res = (APIModel1001) APIModelFactory.getInstance().buildResponse("/api/moment/{id}");
//        res.setUserId(1001L);
//        res.setMomentId(2001L);
//        res.setResCode(200);
//        res.setResMsg("OK");
//
//
//        APIModel1001 res2 = APIModelFactory.getInstance().buildResponse(APIModel1001.class);
//        res2.setUserId(1001L);
//        res2.setMomentId(2001L);
//        res2.setResCode(404);
//        res2.setResMsg("NOT FOUND");
//    }
}
