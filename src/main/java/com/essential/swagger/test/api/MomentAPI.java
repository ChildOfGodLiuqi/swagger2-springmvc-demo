package com.essential.swagger.test.api;

import com.essential.swagger.test.model.APIModel1001;
import com.essential.swagger.test.model.APIModelFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@Api(value = "经历API",description = "apis for moment",position = 0)
@RestController
@RequestMapping(value = "/api/moment", produces = MediaType.APPLICATION_JSON_VALUE)
public class MomentAPI {

    @ApiOperation(value="get Moment List", notes = "Get moment list with page", response = APIModel1001.class, responseContainer = "List")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<APIModel1001> getMomentList(
            @ApiParam(value = "pageNum", required = true, defaultValue = "1")@RequestParam("pageNum")int pageNum,
            @ApiParam(value = "rows", required = true, defaultValue = "10")@RequestParam("rows")int rows,
            HttpServletRequest request, HttpServletResponse response) {
        List<APIModel1001> list = new ArrayList<APIModel1001>();
        APIModel1001 model = (APIModel1001) APIModelFactory.getInstance().buildModel("/api/moment/v1/list");
        list.add(model);
        return list;
    }


}
