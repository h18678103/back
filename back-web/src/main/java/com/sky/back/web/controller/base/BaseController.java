package com.sky.back.web.controller.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;

/**
 * @author huqinsong
 * @date 2018/11/12
 */
public abstract class BaseController implements DataExceptionSolver {

    protected static final Logger log = LoggerFactory.getLogger(BaseController.class);

    protected Map<String, String> getValidErrors(List<ObjectError> objectErrors) {
        Map<String, String> errors = new HashMap<>(objectErrors.size());
        String[] codes;
        for (ObjectError e : objectErrors) {
            codes = e.getCodes()[0].split("\\.");
            errors.put(codes[codes.length - 1], e.getDefaultMessage());
        }
        return errors;
    }
}
