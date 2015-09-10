package com.essential.swagger.test.api;

import com.essential.swagger.test.model.APIModel1002;
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


@Api(value = "商户API",description = "apis for venue",position = 0)
@RestController
@RequestMapping(value = "/api/venue", produces = MediaType.APPLICATION_JSON_VALUE)
public class VenueAPI {

    @ApiOperation(value="get venue List", notes = "Get venue list with page", response = APIModel1002.class, responseContainer = "List")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<APIModel1002> getVenueList(
            @ApiParam(value = "pageNum", required = true, defaultValue = "1")@RequestParam("pageNum")int pageNum,
            @ApiParam(value = "rows", required = true, defaultValue = "10")@RequestParam("rows")int rows,
            HttpServletRequest request, HttpServletResponse response) {
        List<APIModel1002> list = new ArrayList<APIModel1002>();

        return list;
    }


}
