package jihwan.springmvc.web.frontcontroller.v3;


import jihwan.springmvc.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
